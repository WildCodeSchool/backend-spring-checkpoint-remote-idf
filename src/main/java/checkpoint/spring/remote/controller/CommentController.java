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

import com.wild.checkpoint.demo.Entity.Comment;
import com.wild.checkpoint.demo.Entity.Posts;
import com.wild.checkpoint.demo.Service.CommentService;
import com.wild.checkpoint.demo.Service.PostsService;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> GetComments(){
        return this.commentService.getComments();
    }

    @GetMapping("/comments/{id}")
    public Comment GetCommentById(@PathVariable Long id){
        return this.commentService.getComment(id);
    }

    @PostMapping("/comments")
    public Comment createComment(@RequestBody Comment comment){
        return this.commentService.createComment(comment);

    }

    @PutMapping("/comments/{id}")
    public Comment updateComment(@PathVariable Long id, @RequestBody Comment comment){
        return this.commentService.updatePost(id, comment);
    }

    @DeleteMapping("/comments/{id}")
    public boolean deletePost(@PathVariable Long id){
        return this.commentService.deleteComment(id);
    }
}