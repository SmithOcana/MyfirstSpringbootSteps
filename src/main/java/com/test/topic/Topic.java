package com.test.topic;

import lombok.Data;

@Data 
public class Topic {

	
	private Integer id;
	private String name;
	private String description;
	
	public Topic(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
}
