package com.fardoushlab.javabean;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Configuration;

import com.fardoushlab.javabean.model.User;

@Configuration
public class AppRootConfig {
	
	@Bean
	public User user() {
		return new User("Hasib", 0);
	}

}
