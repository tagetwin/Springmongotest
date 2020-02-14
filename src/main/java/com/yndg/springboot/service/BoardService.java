package com.yndg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yndg.springboot.dto.Board;
import com.yndg.springboot.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	public List<Board> getBoardList(){
		return boardRepository.findAll();
	}
	
	public Board insertBoard(Board board) {
		return boardRepository.insert(board);
	}
	
	public void deleteBoard(String id) {
		boardRepository.deleteById(id);
	}
}
