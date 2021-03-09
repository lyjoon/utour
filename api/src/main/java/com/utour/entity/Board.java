package com.utour.entity;

import com.utour.common.contrants.EntityConstants;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@SequenceGenerator(name = "SEQ_BOARD_GEN", sequenceName = "SEQ_BOARD", initialValue = 1, allocationSize = 1)
public class Board {

    @Id
    @GeneratedValue(generator = "SEQ_BOARD_GEN", strategy = GenerationType.SEQUENCE)
    private Integer boardId;

    @Column(length = 200, nullable = false)
    private String title;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private EntityConstants.BoardType boardType;

    @Lob
    @Column
    private String contents;

    private LocalDateTime createAt;

    @Column(length = 50)
    private String writer;

    @Builder
    public Board (Integer boardId, String title, EntityConstants.BoardType boardType, String contents, String writer) {
        this.boardId = boardId;
        this.title = title;
        this.boardType = boardType;
        this.contents = contents;
        this.writer = writer;
    }

}
