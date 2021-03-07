package com.utour.entity;

import com.utour.common.contrants.EntityConstants;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(name = "SEQ_BOARD_GEN", sequenceName = "SEQ_BOARD", initialValue = 1, allocationSize = 1)
@Getter
@Setter
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

    private LocalDateTime createDate;

}
