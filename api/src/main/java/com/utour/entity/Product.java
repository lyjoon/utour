package com.utour.entity;

import com.utour.common.contrants.EntityConstants;
import com.utour.entity.convert.BooleanChar1YnConverter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Product {

    @Id
    private Integer productId;

    @Column(length = 50)
    private String title;

    @Column(length = 10)
    private EntityConstants.ProductType productType;

    @Column(length = 5)
    private String nationCode;

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
}
