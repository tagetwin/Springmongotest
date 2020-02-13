package com.yndg.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yndg.springboot.dto.Board;
import com.yndg.springboot.service.BoardTe;

@SpringBootTest
class SpringbootTestMongoApplicationTests {

	@Autowired
	BoardTe te ;
	
	@Test
	void contextLoads() {
		
	}

	
	@Test
	public void insetTest() {
		Board board = new Board();
		board.setContent("adf");
		board.setTitle("title");
		te.insertEvent(board);
	}
}
