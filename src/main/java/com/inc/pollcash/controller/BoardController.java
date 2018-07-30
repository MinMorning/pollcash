package com.inc.pollcash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inc.pollcash.domain.Board;
import com.inc.pollcash.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;

	@GetMapping("/board/list")
	public String list(Model model, HttpSession session) {
		model.addAttribute("boardList",boardService.list());
		return "/board/board";
	}
	@GetMapping("/board/insert")
	public String add(Model model) {
		model.addAttribute("board", new Board());
		return "/board/insert";
	}
	@GetMapping("/board/view")
	public String view(Board board, int id, HttpServletRequest request, Model model) {
		id = Integer.parseInt(request.getParameter("id"));
		board = boardService.selectOne(id);
		boardService.plusHit(id);
		model.addAttribute("board", board);
		return "/board/view";
	}
}
