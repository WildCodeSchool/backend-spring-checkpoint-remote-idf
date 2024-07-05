package com.wild.checkpoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wild.checkpoint.demo.Entity.Comment;
import com.wild.checkpoint.demo.Entity.Posts;
import com.wild.checkpoint.demo.Entity.User;
import com.wild.checkpoint.demo.Service.CommentService;
import com.wild.checkpoint.demo.Service.UserService;

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

		var post = new Posts();
		var comment= new Comment();
		comment.setMessage("Lorem ipsum dolor sit amet consectetur adipisicing elit. Facere non excepturi quo in! Est cupiditate");
		comment.setImageUrl("https://www.change-your-home.com/wp-content/uploads/2019/10/meuse-chasse-balle-pied-770x400.jpg");


		var service = new UserService();
		service.CreateUser(user1);
		service.CreateUser(user2);

		var commentService = new CommentService();
		commentService.CreateComment(comment);
	}

}
