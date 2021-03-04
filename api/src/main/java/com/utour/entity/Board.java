package com.utour.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "SEQ_BOARD_GEN", sequenceName = "SEQ_BOARD", initialValue = 1)
@Getter
@Setter
public class Board {

    @Id
    @GeneratedValue(generator = "SEQ_BOARD_GEN", strategy = GenerationType.AUTO)
    private Integer seq;

    @Column(length = 200, nullable = false)
    private String title;

    @Lob
    @Column
    private String contents;

    private LocalDate createDate;

}
