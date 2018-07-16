package com.inc.pollcash.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
