package com.utour.entity;

import com.utour.common.contrants.EntityConstants;
import lombok.*;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "SEQ_IMAGE_GEN", sequenceName = "SEQ_IMAGE", initialValue = 1)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {

    @Id
    @GeneratedValue(generator = "SEQ_IMAGE_GEN", strategy = GenerationType.AUTO)
    private Integer imageId;

    @Column
    private Integer refId;

    @Column(length = 800)
    private String imageSrc;

    private EntityConstants.ImageType imageType;

    @Column(length = 50)
    private String imageAlt;
}
