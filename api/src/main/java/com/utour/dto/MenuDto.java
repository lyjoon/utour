package com.utour.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class MenuDto {

    /**
     * 메뉴명
     */
    private String menuName;

    /**
     * 국가코드
     */
    private String nationCode;

    /**
     * 지역코드
     */
    private String areaCode;
}
