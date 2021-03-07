package com.utour.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PageDto<T extends java.util.Collection<?>> {

    private Integer page;

    private Integer size;

    private T data;
}
