package com.wild.checkpoint.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.wild.checkpoint.demo.Entity.Posts;
import com.wild.checkpoint.demo.Repository.PostsRepository;


@Service
public class PostsService {

    @Autowired
    PostsRepository postsRepository;

    public List<Posts> getPosts(){
        return this.postsRepository.findAll();
    }

    public Posts getPost(Long id){
        return this.postsRepository.findById(id).get();
    }

    public Posts createPost(@RequestBody Posts post){
        return this.postsRepository.save(post);

    }

    public Posts updatePost(@PathVariable Long id, @RequestBody Posts post){
        Posts postToUpdate = this.postsRepository.findById(id).get();
        postToUpdate.setAuthor(post.getAuthor());
        postToUpdate.setCommentIsVisible(post.getCommentIsVisible());
        postToUpdate.setComments(post.getComments());
        postToUpdate.setImageUrl(post.getImageUrl());
        postToUpdate.setMessage(post.getMessage());
        return this.postsRepository.save(postToUpdate);
    }

    public boolean deleteUser(@PathVariable Long id){
        this.postsRepository.deleteById(id);
        return true;
    }
}