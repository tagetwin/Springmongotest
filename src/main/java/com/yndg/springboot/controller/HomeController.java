package com.yndg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yndg.springboot.dto.Board;
import com.yndg.springboot.service.BoardService;

@Controller
public class HomeController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/")
	public String Home(Model model) {
		
		List<Board> boards = boardService.getBoardList();
		
		model.addAttribute("boards", boards);
		
		return "home";
		
	}
}
