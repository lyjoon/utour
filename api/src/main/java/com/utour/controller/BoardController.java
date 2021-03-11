package com.utour.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.utour.common.contrants.Constants;
import com.utour.common.contrants.EntityConstants;
import com.utour.dto.ReplyDto;
import com.utour.dto.ResponseDto;
import com.utour.dto.board.QnaDto;
import com.utour.dto.board.ReviewDto;
import com.utour.dto.board.BoardDto;
import com.utour.exception.ValidException;
import com.utour.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/board", produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardController {

    private final BoardService boardService;

    private ObjectMapper objectMapper;

    private final Validator validator;

    @PostConstruct
    public void postConstruct(){
        this.objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)// ENUM 값이 존재하지 않으면 null로 설정한다. Enum 항목이 추가되어도 무시하고 넘어가게 할 때 필요하다.
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)// 시간을 timestamp 숫자가 아닌, 문자열로 포맷팅한다. 기본 ISO 포맷
        ;
    }

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
                                                       @RequestParam(value = "q", required = false) String query) {
        return Mono.just(Optional.ofNullable(boardType).orElse(EntityConstants.BoardType.NOTICE))
                .map(type -> boardService.getPage(boardType, page, query));
    }

    /**
     * 게시물 저장
     * @param boardType
     * @param request
     * @return
     */
    @PutMapping(value = "/{board_type}")
    public Mono<ResponseEntity<ResponseDto>> save(@PathVariable(value = "board_type") EntityConstants.BoardType boardType, HttpServletRequest request) {
        return Mono.just(this.readBody(boardType, request))
                .map(command -> {
                    this.boardService.save(boardType, command);
                    return ResponseEntity.ok(ResponseDto.builder()
                            .status(HttpStatus.OK.value())
                            .build());
                });
    }

    /**
     * request 본문 추출
     * @param boardType
     * @param request
     * @return
     */
    private BoardDto readBody(EntityConstants.BoardType boardType, HttpServletRequest request) {
        try {
            BoardDto command;
            switch (boardType){
                case QNA:
                    command = this.objectMapper.readValue(request.getInputStream(), QnaDto.class);
                    break;
                case REVIEW:
                    command = this.objectMapper.readValue(request.getInputStream(), ReviewDto.class);
                    break;
                default:
                    command = this.objectMapper.readValue(request.getInputStream(), BoardDto.class);
            }

            BindingResult bindingResult = new BeanPropertyBindingResult(command, command.getClass().getSimpleName());
            this.validator.validate(command, bindingResult);

            if(bindingResult.hasErrors()) {
                throw ValidException.builder().bindingResult(bindingResult).build();
            }

            return command;
        } catch (ValidException ve) {
            throw ve;
        } catch (Exception e) {
            throw ValidException.builder().throwable(e).build();
        }
    }
}
