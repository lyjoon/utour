package com.utour.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class QnA {

    @Id
    private Integer boardId;

    @Column(length = 100)
    private String password;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @Builder
    public QnA(Integer boardId, String password, Board board) {
        this.boardId = boardId;
        this.password = password;
        this.board = board;
    }
}
