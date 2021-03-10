package com.utour.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.utour.TestLocalApplication;
import com.utour.dto.board.QnaDto;
import org.junit.Test;

public class TestBoardService extends TestLocalApplication {

    @Test
    public void testConv() throws JsonProcessingException {
        String jsonString = "{\n" +
                "    \"password\": \"1234\",\n" +
                "    \"title\": \"제목\",\n" +
                "    \"contents\": \"내용\",\n" +
                "    \"writer\": \"홍길동\",\n" +
                "    \"boardId\": null\n" +
                "}";

        ObjectMapper objectMapper  = new ObjectMapper();

        QnaDto qnaDto = objectMapper.readValue(jsonString, QnaDto.class);

        log.info("qna.dto : {}", objectMapper.writeValueAsString(qnaDto));
    }
}
