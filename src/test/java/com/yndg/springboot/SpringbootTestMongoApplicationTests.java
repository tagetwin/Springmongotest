package com.yndg.springboot;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yndg.springboot.dto.Board;
import com.yndg.springboot.service.BoardService;
import com.yndg.springboot.service.BoardTe;

@SpringBootTest
class SpringbootTestMongoApplicationTests {
	
	@Autowired
	BoardService boardService;
	
	@Test
	void contextLoads() {
		
	}

	
//	@Test
//	public void insetTest() {
//		Board board = new Board();
//		board.setContent("adf");
//		board.setTitle("title");
//		te.insertEvent(board);
//	}
	
	@Test
	public void findAllTest() {
		List<Board> boards = boardService.getBoardList();
		for(int i=0; i<boards.size(); i++) {
			System.out.println(boards.get(i));
		}
		
	}
	
	@Test
	public void deleteTest() {
		String id = "5e45e7480135e161135c0bd0";
		boardService.deleteBoard(id);
	}
}
