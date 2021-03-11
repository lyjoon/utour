package com.utour.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * 응답 dto
 */
@Getter
@SuperBuilder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {

    /**
     * 에러상태, 주로 httpStatus
     */
    private Integer status;

    /**
     * 응답 메세지
     */
    private String message;
}
