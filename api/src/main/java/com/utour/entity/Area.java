package com.utour.entity;

import com.utour.entity.convert.BooleanChar1YnConverter;
import com.utour.entity.index.AreaId;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Entity
@NoArgsConstructor
public class Area {

    @EmbeddedId
    private AreaId areaId;

    /**
     * 지역명
     */
    @Column(length = 50)
    private String areaName;


    /**
     * 사용여부
     */
    @Column(length = 1)
    @Convert(converter = BooleanChar1YnConverter.class)
    private Boolean enable;

}
