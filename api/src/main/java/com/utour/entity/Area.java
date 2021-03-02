package com.utour.entity;

import com.utour.entity.index.AreaId;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
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

}
