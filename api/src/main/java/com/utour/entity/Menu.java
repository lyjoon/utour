package com.utour.entity;

import com.utour.entity.convert.BooleanChar1YnConverter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 메뉴 정보
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SequenceGenerator(name = "SEQ_MENU_GEN", sequenceName = "SEQ_MENU", initialValue = 1, allocationSize = 1)
public class Menu {

    /**
     * ID
     */
    @Id
    @GeneratedValue(generator = "SEQ_MENU_GEN", strategy = GenerationType.SEQUENCE)
    private Integer menuId;

    /**
     * 메뉴명
     */
    @Column(length = 50)
    private String menuName;

    /**
     * 국가코드
     */
    @Column(length = 5)
    private String countryCode;

    /**
     * 지역코드
     */
    @Column(length = 5)
    private String areaCode;

    /**
     * 노출순서
     */
    private Integer orderNo;

    /**
     * 사용여부
     */
    @Column(length = 1)
    @Convert(converter = BooleanChar1YnConverter.class)
    private Boolean enable;

    @Builder
    public Menu(Integer menuId, String menuName, String countryCode, String areaCode, Integer orderNo, Boolean enable) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.orderNo = orderNo;
        this.enable = enable;
    }
}
