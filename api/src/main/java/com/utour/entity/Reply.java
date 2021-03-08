package com.utour.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@SequenceGenerator(name = "SEQ_REPLY_GEN", sequenceName = "SEQ_REPLY", initialValue = 1, allocationSize = 1)
public class Reply {

    @Id
    @GeneratedValue(generator = "SEQ_REPLY_GEN", strategy = GenerationType.SEQUENCE)
    private Integer seq;

    private Integer boardId;

    @Column(length = 4000)
    private String reply;

    @Column(length = 200)
    private String password;

    @Column(length = 50)
    private String writer;

}
