package com.utour.entity.index;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AreaId implements Serializable {

    /**
     * 국가코드
     */
    @Column(length = 5)
    @EqualsAndHashCode.Include
    private String nationCode;

    /**
     * 지역코드
     */
    @Column(length = 5)
    @EqualsAndHashCode.Include
    private String areaCode;
}
