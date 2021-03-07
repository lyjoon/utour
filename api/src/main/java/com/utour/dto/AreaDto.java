package com.utour.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AreaDto {

    private String countryCode;

    private String areaCode;

    private String areaName;

}
