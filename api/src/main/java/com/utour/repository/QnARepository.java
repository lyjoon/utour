package com.utour.repository;

import com.utour.entity.QnA;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QnARepository extends CrudRepository<QnA, Integer> {

    Page<QnA> findAll(Pageable pageable);
}
