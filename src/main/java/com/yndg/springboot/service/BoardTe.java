package com.yndg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.yndg.springboot.dto.Board;

@Service
public class BoardTe {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
//	public Board getEvent(String _id) {
//		Board event = mongoTemplate.findById(_id, Board.class);
//		return Optional.ofNullable(event).orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Not found event"));
//	}
	
	public List<Board> getEventList(String title) {
		Query query = new Query().addCriteria(Criteria.where("title").is(title));
		return mongoTemplate.find(query, Board.class);
	}
	
	public Board insertEvent(Board body) { 
		return mongoTemplate.insert(body);
	}

}