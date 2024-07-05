package checkpoint.spring.remote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.entity.Post;
import checkpoint.spring.remote.repository.PostRepository;


@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAll() {
        List<Post> posts = this.postRepository.findAll();
        return posts;
    }

    public Post getById(Long id) {
        Post post = this.postRepository.findById(id).get();
        return post;
    }

     public Post create(Post post) {
        Post createdPost = this.postRepository.save(post);
        return createdPost;
    }

    public Post update(Long id, Post post) {
        Post retrievedPost = this.postRepository.findById(id).get();
        retrievedPost.setMessage(post.getMessage());
        retrievedPost.setImageUrl(post.getImageUrl());
        Post updatedPost = this.postRepository.save(post);
        return updatedPost;
    }

    public void delete(Long id) {
        this.postRepository.deleteById(id);
    }
}
