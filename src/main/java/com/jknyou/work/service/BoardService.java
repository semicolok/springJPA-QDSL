package com.jknyou.work.service;

import java.util.List;

import com.jknyou.work.model.Board;

public interface BoardService {
	List<Board> getAll();
	void save(Board board);
}
