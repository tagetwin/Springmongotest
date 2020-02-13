package com.yndg.springboot.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("board")
@Data
public class Board {
	
	@Id
	private String _id;
	private String title;
	private String content;
	
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + "]";
	}
	
}
