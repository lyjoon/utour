package com.utour.dto.board;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class QnaDto extends BoardDto {

    @NotNull
    private String password;
}
