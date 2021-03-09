package com.utour.entity;

import com.utour.entity.convert.BooleanChar1YnConverter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 여행 국가코드
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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


    @Builder
    public Country(String countryCode, String countryName, Boolean enable) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.enable = enable;
    }
}
