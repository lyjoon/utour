package com.utour.entity;

import javax.persistence.*;
import java.util.List;

@Entity
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
}
