package com.wild.checkpoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wild.checkpoint.demo.Entity.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// J'ai initialisé à l'aide de Postman
		var user1 = new User();
		user1.setFirstname("Joe");
		user1.setLastname("start");
		var user2 = new User();
		user2.setFirstname("Baden");
		user2.setLastname("Powell");
	}

}
