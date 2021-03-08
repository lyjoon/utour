package com.utour.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PagingDto<T extends java.util.Collection<?>> {

    private int page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer size;

    private T data;
}
