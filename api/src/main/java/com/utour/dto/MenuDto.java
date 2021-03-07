package com.utour.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuDto {

    /**
     * 메뉴명
     */
    private String menuName;

    /**
     * 국가코드
     */
    private String countryCode;

    /**
     * 지역코드
     */
    private String areaCode;
}
