package com.utour.controller;

import com.utour.common.contrants.Constants;
import com.utour.dto.ReplyDto;
import com.utour.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/board", produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardController {

    private final BoardService boardService;

    @GetMapping(value = "/replies/{board_id}/{page}")
    public Mono<List<ReplyDto>> getReplies(@PathVariable(value = "board_id") Integer boardId,
                                           @PathVariable(value = "page") Integer page){
        return Mono.just(boardId)
                .map(id -> boardService.getReplies(boardId, PageRequest.of(page, Constants.DEFAULT_PAGING_COUNT)));
    }

}
