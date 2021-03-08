package com.utour.service;

import com.utour.common.contrants.Constants;
import com.utour.common.contrants.EntityConstants;
import com.utour.common.service.CommonService;
import com.utour.dto.PagingDto;
import com.utour.dto.ReplyDto;
import com.utour.dto.board.BoardDto;
import com.utour.repository.QnARepository;
import com.utour.repository.BoardRepository;
import com.utour.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService extends CommonService {

    private final ReplyRepository replyRepository;

    private final BoardRepository boardRepository;

    private final QnARepository qnARepository;

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
}
