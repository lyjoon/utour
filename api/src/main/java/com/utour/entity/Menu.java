package com.utour.entity;

import com.utour.entity.convert.BooleanChar1Yn;
import lombok.Getter;

import javax.persistence.*;

/**
 * 메뉴 정보
 */
@Entity
@Getter
@SequenceGenerator(name = "SEQ_MENU_GEN", sequenceName = "SEQ_MENU", initialValue = 1, allocationSize = 5)
public class Menu {

    /**
     * ID
     */
    @Id
    @GeneratedValue(generator = "SEQ_MENU_GEN", strategy = GenerationType.SEQUENCE)
    private Integer menuId;


    /**
     * 국가코드
     */
    @Column(length = 5)
    private String nationCode;

    /**
     * 지역코드
     */
    @Column(length = 5)
    private String areaCode;

    /**
     * 메뉴명
     */
    @Column(length = 50)
    private String name;

    /**
     * 노출순서
     */
    private Integer order;

    /**
     * 사용여부
     */
    @Column(length = 1)
    @Convert(converter = BooleanChar1Yn.class)
    private Boolean enable;

}
