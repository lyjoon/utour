package com.utour.repository;

import com.utour.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Integer> {

    Page<Review> findAll(Pageable pageable);
}
