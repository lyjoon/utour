package com.utour.repository;

import com.utour.entity.Reply;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends CrudRepository<Reply, Integer> {

    Slice<Reply> findByBoardId(Integer boardId, Pageable pageable);

}
