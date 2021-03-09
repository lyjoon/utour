package com.utour.entity;

import com.utour.common.contrants.EntityConstants;
import com.utour.entity.convert.BooleanChar1YnConverter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    private Integer productId;

    @Column(length = 50)
    private String title;

    @Column(length = 10)
    private EntityConstants.ProductType productType;

    @Column(length = 5)
    private String countryCode;

    @Column(length = 5)
    private String areaCode;

    @Lob
    @Column
    private String contents;

    @Column(length = 1)
    @Convert(converter = BooleanChar1YnConverter.class)
    private Boolean display;


    @Column(length = 1)
    @Convert(converter = BooleanChar1YnConverter.class)
    private Boolean refund;

    @Builder
    public Product(Integer productId, String title, EntityConstants.ProductType productType, String countryCode, String areaCode, String contents, Boolean display, Boolean refund) {
        this.productId = productId;
        this.title = title;
        this.productType = productType;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.contents = contents;
        this.display = display;
        this.refund = refund;
    }
}
