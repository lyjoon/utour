package com.utour.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review {


    @Id
    private Integer boardId;

    private Integer score;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @Builder
    public Review(Integer boardId, Integer score, Board board) {
        this.boardId = boardId;
        this.score = score;
        this.board = board;
    }
}
