package com.utour.repository;

import com.utour.TestLocalApplication;
import com.utour.entity.Board;
import com.utour.entity.QnA;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class TestQnARepository extends TestLocalApplication {

    @Autowired
    private QnARepository qnARepository;

    @Test
    public void testList(){
        Page<QnA> page = this.qnARepository.findAll(PageRequest.of(0, 10));
        log.info("size : {}", page.getTotalElements());
    }
}
