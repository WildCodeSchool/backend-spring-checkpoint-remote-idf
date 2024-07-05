package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.repository.PostRepository;
import io.swagger.v3.oas.annotations.Operation;
import checkpoint.spring.remote.entity.Post;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostRepository postRepository;
    
    @Operation(summary = "Get all posts", description = "Get all posts")
    @GetMapping("")
    public List<Post> getAll() {
        return this.postRepository.findAll();
    }

    @Operation(summary = "Get post by Id", description = "Get post by Id")
    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id) {
        return this.postRepository.findById(id).get();
    }

    @Operation(summary = "Update post", description = "Update post")
    @PostMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        Post updatePost = this.postRepository.findById(id).get();
        updatePost.setImage(post.getImage());
        updatePost.setMessage(post.getMessage());
        return this.postRepository.save(updatePost);
    }

    @Operation(summary = "Delete post", description = "Delete post")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.postRepository.deleteById(id);
    }
}
