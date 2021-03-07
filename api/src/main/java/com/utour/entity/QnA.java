package com.utour.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class QnA {

    @Id
    private Integer boardId;

    @Column(length = 50)
    private String writer;

    @Column(length = 100)
    private String password;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

}
