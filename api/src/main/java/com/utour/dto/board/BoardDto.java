package com.utour.dto.board;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {

    private Integer boardId;

    @NotNull
    private String title;

    @NotNull
    private String contents;

    @NotNull
    private String writer;

    private LocalDateTime createAt;

}
