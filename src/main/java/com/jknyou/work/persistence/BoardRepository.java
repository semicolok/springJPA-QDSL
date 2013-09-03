package com.jknyou.work.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.jknyou.work.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long>, QueryDslPredicateExecutor<Board>{
}
