package com.utour.repository;

import com.utour.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends CrudRepository<Board, Integer> {

    Page<Board> findAll(Pageable pageable);
}
