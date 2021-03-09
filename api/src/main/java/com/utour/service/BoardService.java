package com.utour.service;

import com.utour.common.contrants.Constants;
import com.utour.common.contrants.EntityConstants;
import com.utour.common.service.CommonService;
import com.utour.dto.ReplyDto;
import com.utour.dto.board.SaveDto;
import com.utour.dto.board.BoardDto;
import com.utour.dto.board.QnaDto;
import com.utour.dto.board.ReviewDto;
import com.utour.entity.Board;
import com.utour.entity.QnA;
import com.utour.entity.Review;
import com.utour.repository.QnARepository;
import com.utour.repository.BoardRepository;
import com.utour.repository.ReplyRepository;
import com.utour.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.function.Function;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService extends CommonService {

    private final ReplyRepository replyRepository;

    private final BoardRepository boardRepository;

    private final QnARepository qnARepository;

    private final ReviewRepository reviewRepository;

    /**
     * 댓글 조회
     * @param boardId
     * @return
     */
    public Slice<ReplyDto> getReplies(Integer boardId, Pageable pageable) {
        return replyRepository.findByBoardId(boardId, pageable).map(entity -> ReplyDto.builder()
                .reply(entity.getReply())
                .seq(entity.getSeq())
                .writer(entity.getWriter())
                .build());
    }

    /**
     * 게시판 페이지 조회
     * @param boardType
     * @param page
     * @param query
     * @return
     */
    public Page<? extends BoardDto> getPage(EntityConstants.BoardType boardType, Integer page, String query ){
        boardRepository.selectByQuery(PageRequest.of(page, Constants.DEFAULT_PAGING_COUNT), query);
        switch (boardType){
            case QNA:
            case REVIEW:
            default:
                return this.boardRepository.selectByQuery(PageRequest.of(page, Constants.DEFAULT_PAGING_COUNT), query)
                        .map(board ->
                                BoardDto.builder()
                                    .boardId(board.getBoardId())
                                    .contents(board.getContents())
                                    .title(board.getTitle())
                                    .build()
                        );
        }
    }

    /**
     * 게시물 저장
     * @param boardType
     * @param command
     */
    public void save(EntityConstants.BoardType boardType, SaveDto command) {

        Function<? super BoardDto, Mono<Board>> function = boardDto ->  Mono.just(this.boardRepository.save(Board.builder()
                .boardType(boardType)
                .writer(boardDto.getWriter())
                .title(boardDto.getTitle())
                .contents(boardDto.getContents())
                .boardId(boardDto.getBoardId())
                .build())
        );

        switch (Optional.ofNullable(boardType).orElse(EntityConstants.BoardType.NOTICE)){
            case QNA:
                QnaDto qnaDto = command.getQna();
                function.apply(qnaDto).subscribe(board -> {
                    this.qnARepository.save(QnA.builder()
                            .password(qnaDto.getPassword())
                            .boardId(board.getBoardId())
                            .build());
                });
                break;
            case REVIEW:
                ReviewDto reviewDto = command.getReview();
                function.apply(reviewDto).subscribe(board -> {
                    this.reviewRepository.save(Review.builder()
                            .score(reviewDto.getScore())
                            .boardId(board.getBoardId())
                            .build());
                });
                break;
        }
    }
}
