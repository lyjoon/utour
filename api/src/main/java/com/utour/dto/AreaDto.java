package com.utour.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AreaDto {

    private String nationCode;

    private String areaCode;

    private String areaName;

}
