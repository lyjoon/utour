package com.utour.repository;

import com.utour.TestLocalApplication;
import com.utour.entity.Review;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class TestReviewRepository extends TestLocalApplication {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void testPage(){
        Page<Review> page = this.reviewRepository.findAll(PageRequest.of(0,10));
        long cnt = page.getTotalElements();
        log.info("count : {}", cnt);
    }
}
