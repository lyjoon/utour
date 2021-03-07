package com.utour.entity;

import com.utour.entity.convert.BooleanChar1YnConverter;
import lombok.Getter;

import javax.persistence.*;

/**
 * 여행 국가코드
 */
@Entity
@Getter
public class Country {

    /**
     * 국가코드
     */
    @Id
    @Column(length = 5)
    private String countryCode;

    /**
     * 국가명
     */
    @Column(length = 50)
    private String countryName;

    /**
     * 사용여부
     */
    @Column(length = 1)
    @Convert(converter = BooleanChar1YnConverter.class)
    private Boolean enable;
}
