package com.yndg.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yndg.springboot.dto.Board;

public interface BoardRepository extends MongoRepository<Board, String>{

//	Board findBytitle(String title);
	
}
