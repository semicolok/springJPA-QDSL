package com.jknyou.work.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jknyou.work.model.Board;
import com.jknyou.work.service.BoardService;

@Controller
public class BoardController {
	private static final String JSON_VIEW = "jsonView";
	@Inject private BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap map) {
		return "board";
	}
	
	@RequestMapping(value = "/boards", method = RequestMethod.GET)
	public String getBoards(ModelMap map) {
		map.put("boardList", boardService.getAll());
		return JSON_VIEW;
	}
	@RequestMapping(value = "/boards/get/{board}", method = RequestMethod.GET)
	public String getBoard(@PathVariable Board board, ModelMap map) {
		System.out.println(board.getId());
		System.out.println(board.getContent());
		return JSON_VIEW;
	}
	@RequestMapping(value = "/boards", method = RequestMethod.POST)
	public String saveBoard(Board board, ModelMap map) {
		boardService.save(board);
		map.put("result", "success");
		return JSON_VIEW;
	}
}
