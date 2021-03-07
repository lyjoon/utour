package com.utour.service;

import com.utour.common.contrants.EntityConstants;
import com.utour.common.service.CommonService;
import com.utour.dto.BoardDto;
import com.utour.dto.PageDto;
import com.utour.dto.ReplyDto;
import com.utour.repository.QnARepository;
import com.utour.repository.BoardRepository;
import com.utour.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
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
    public List<ReplyDto> getReplies(Integer boardId, Pageable pageable) {
        return replyRepository.findByBoardId(boardId, pageable)
                .stream().map(entity -> ReplyDto.builder()
                        .reply(entity.getReply())
                        .seq(entity.getSeq())
                        .writer(entity.getWriter())
                        .build())
                .collect(Collectors.toList());
    }

    public PageDto<java.util.List<?>> getBoardList(EntityConstants.BoardType boardType, String query, Integer page){
        return null;
    }
}
