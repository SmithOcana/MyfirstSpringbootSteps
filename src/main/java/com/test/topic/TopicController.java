package com.test.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {

	
	/*@RequestMapping("/topics")
	public String getAllTopicks() {
		return "All Topics";
	}*/
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopicks(){
		return Arrays.asList(
				new Topic(1,"Spring Framework","Spring Framework Descripcion"),
				new Topic(2,"Core Java","Core Java Descripcion"),
				new Topic(3,"JavaScritp Framework","JavaScritp Framework Descripcion")				
				);
			
	}

}
