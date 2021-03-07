package com.utour.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Review {


    @Id
    private Integer boardId;

    private Integer score;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

}
