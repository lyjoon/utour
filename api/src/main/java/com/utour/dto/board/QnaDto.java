package com.utour.dto.board;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class QnaDto extends BoardDto{

    private String password;
}
