package com.jknyou.work.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jknyou.work.model.Board;
import com.jknyou.work.persistence.BoardRepository;
import com.jknyou.work.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject private BoardRepository boardRepository;

	@Override
	public List<Board> getAll() {
		return boardRepository.findAll();
	}

	@Override
	public void save(Board board) {
		boardRepository.saveAndFlush(board);
	}

}
