package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.entity.Post;
import checkpoint.spring.remote.repository.PostRepository;
;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostRepository postRepository;
    
    
    @GetMapping("")
    public List<Post> getAll() {
        return this.postRepository.findAll();
    }

    
    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id) {
        return this.postRepository.findById(id).get();
    }

    
    @PutMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        Post updatePost = this.postRepository.findById(id).get();
        updatePost.setImageUrl(post.getImageUrl());
        updatePost.setMessage(post.getMessage());
        return this.postRepository.save(updatePost);
    }

    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.postRepository.deleteById(id);
    }
}
