package com.utour.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductRoom {

    @Id
    private Integer productRoomId;

    private Integer productId;

    @Column(length = 50)
    private String productRoomName;

    @Column(length = 500)
    private String productRoomDesc;

    @JoinColumn(name = "refer_id")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Image> pictures;

    @Builder
    public ProductRoom(Integer productRoomId, Integer productId, String productRoomName, String productRoomDesc, List<Image> pictures) {
        this.productRoomId = productRoomId;
        this.productId = productId;
        this.productRoomName = productRoomName;
        this.productRoomDesc = productRoomDesc;
        this.pictures = pictures;
    }
}
