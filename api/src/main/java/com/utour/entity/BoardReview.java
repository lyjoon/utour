package com.utour.entity;

import lombok.Getter;

import javax.persistence.Entity;

@Entity
@Getter
public class BoardReview extends BoardQnA {

    private Integer score;

}
