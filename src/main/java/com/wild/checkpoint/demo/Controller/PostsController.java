package com.wild.checkpoint.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wild.checkpoint.demo.Entity.Posts;
import com.wild.checkpoint.demo.Entity.User;
import com.wild.checkpoint.demo.Service.PostsService;
import com.wild.checkpoint.demo.Service.UserService;

@RestController
public class PostsController {

    @Autowired
    PostsService postsService;

    @GetMapping("/posts")
    public List<Posts> GetPosts(){
        return this.postsService.GetPosts();
    }

    @GetMapping("/posts/{id}")
    public Posts GetPostById(@PathVariable Long id){
        return this.postsService.GetPost(id);
    }

    @PostMapping("/posts")
    public Posts createPost(@RequestBody Posts post){
        return this.postsService.CreatePost(post);

    }

    @PutMapping("/posts/{id}")
    public Posts updatePost(@PathVariable Long id, @RequestBody Posts post){
        return this.postsService.UpdatePost(id, post);
    }

    @DeleteMapping("/posts/{id}")
    public boolean deletePost(@PathVariable Long id){
        return this.postsService.DeleteUser(id);
    }
}
