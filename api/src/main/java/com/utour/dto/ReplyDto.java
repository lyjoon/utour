package com.utour.dto;

import lombok.*;

@Data
@Builder
public class ReplyDto {

    private Integer seq;

    private String reply;

    private String writer;
}
