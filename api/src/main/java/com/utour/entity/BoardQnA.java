package com.utour.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class BoardQnA {

    @Id
    private Integer boardId;

    @Column(length = 50)
    private String writer;

    @Column(length = 100)
    private String password;

}
