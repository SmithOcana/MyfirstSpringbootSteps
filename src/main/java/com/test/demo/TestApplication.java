package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication
// this is because the controller is no under the main class package
@ComponentScan("com.test.test")
@ComponentScan("com.test.topic")
@ComponentScan("com.test.error")

@Configuration
/* @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})*/
public class TestApplication {

	/*
	public static void main(String[] args) {
		//SpringApplication.run(TestApplication.class, args);
	}*/

}
