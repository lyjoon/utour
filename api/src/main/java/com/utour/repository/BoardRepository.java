package com.utour.repository;

import com.querydsl.core.QueryResults;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.utour.entity.Board;
import com.utour.entity.QBoard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public interface BoardRepository extends BoardRepositorySupport, CrudRepository<Board, Integer> {

    Page<Board> findAll(Pageable pageable);
}

interface BoardRepositorySupport {
    Page<Board> selectByQuery(Pageable pageable, String query);
}

@Slf4j
@Repository
class BoardRepositorySupportImpl extends QuerydslRepositorySupport implements BoardRepositorySupport {

    private final JPAQueryFactory queryFactory;

    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     */
    public BoardRepositorySupportImpl(JPAQueryFactory queryFactory) {
        super(Board.class);
        this.queryFactory = queryFactory;
    }

    @Override
    public Page<Board> selectByQuery(Pageable pageable, String query) {
        QBoard board = QBoard.board;
        // JPAQuery<Board> jpaQuery = this.queryFactory.selectFrom(board);
        // contents 제외(상세에서 조회)
        JPAQuery<Board> jpaQuery = this.queryFactory.select(Projections.bean(board, board.boardId, board.boardType, board.title, board.createAt, board.writer)).from(board);
        if(Objects.nonNull(query))
            jpaQuery.where(board.title.contains(query)
                                .or(board.contents.contains(query)));
        QueryResults<Board> results = jpaQuery
                .orderBy(board.boardId.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();
        return new PageImpl<>(results.getResults(), pageable, results.getTotal());
    }
}