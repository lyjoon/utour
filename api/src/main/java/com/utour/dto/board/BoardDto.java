package com.utour.dto.board;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {

    private Integer boardId;

    private String title;

    private String contents;

    private String writer;

    private LocalDateTime createAt;

}
