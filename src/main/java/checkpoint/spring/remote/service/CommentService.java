package com.wild.checkpoint.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.wild.checkpoint.demo.Entity.Comment;
import com.wild.checkpoint.demo.Repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public List<Comment> getComments(){
        return this.commentRepository.findAll();
    }

    public Comment getComment(Long id){
        return this.commentRepository.findById(id).get();
    }

    public Comment createComment(@RequestBody Comment comment){
        return this.commentRepository.save(comment);

    }

    public Comment updatePost(@PathVariable Long id, @RequestBody Comment comment){
        Comment commentToUpdate = this.commentRepository.findById(id).get();
        commentToUpdate.setMessage(comment.getMessage());
        commentToUpdate.setPosts(comment.getPosts());
        return this.commentRepository.save(commentToUpdate);
    }

    public boolean deleteComment(@PathVariable Long id){
        this.commentRepository.deleteById(id);
        return true;
    }
}