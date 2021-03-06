package com.inc.pollcash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PollcashController {

	@GetMapping("/main")
	public String main(Model model) {
		return "main";
	}
	
	@GetMapping("/member/join")
	public String join(Model model) {
		return "member/join";
	}
	
	@GetMapping("/contact")
	public String contact(Model model) {
		return "contact";
	}
	
}
