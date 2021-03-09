package com.utour.controller;

import com.utour.common.contrants.Constants;
import com.utour.common.contrants.EntityConstants;
import com.utour.dto.ReplyDto;
import com.utour.dto.board.SaveDto;
import com.utour.dto.board.BoardDto;
import com.utour.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/board", produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardController {

    private final BoardService boardService;

    @GetMapping(value = "/replies/{board_id}/{page}")
    public Mono<Slice<ReplyDto>> getReplies(@PathVariable(value = "board_id") Integer boardId,
                                            @PathVariable(value = "page") Integer page){
        return Mono.just(boardId)
                .map(id -> boardService.getReplies(boardId, PageRequest.of(page, Constants.DEFAULT_PAGING_COUNT)));
    }


    /**
     * 게시판 목록 조회
     * @param boardType
     * @param page
     * @param query
     * @return
     */
    @GetMapping(value = "/list/{board_type}/{page}")
    public Mono<Page<? extends BoardDto>> getBoardList(@PathVariable(value = "board_type") EntityConstants.BoardType boardType,
                                                       @PathVariable(value = "page") Integer page,
                                                       @RequestParam(value = "q", required = false) String query

    ) {
        return Mono.just(Optional.ofNullable(boardType).orElse(EntityConstants.BoardType.NOTICE))
                .map(type -> boardService.getPage(boardType, page, query));
    }

    /**
     * 저장
     * @param boardType
     * @param command
     * @param <T>
     * @return
     */
    @PutMapping(value = "/{board_type}")
    public <T extends BoardDto> ResponseEntity<Void> save(@PathVariable(value = "board_type") EntityConstants.BoardType boardType,@RequestBody SaveDto command) {
        this.boardService.save(boardType, command);
        return ResponseEntity.ok(null);
    }
}
