package com.utour.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Getter
@Entity
@SequenceGenerator(name = "SEQ_BOARD_REPLY_GEN", sequenceName = "SEQ_BOARD_REPLY")
public class BoardReply {

    @Id
    private Integer seq;

    private Integer boardId;

    @Column(length = 4000)
    private String reply;
}
