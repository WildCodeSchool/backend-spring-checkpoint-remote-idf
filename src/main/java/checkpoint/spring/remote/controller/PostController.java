package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.entity.Post;
import checkpoint.spring.remote.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/posts")
public class PostController {
    
    @Autowired
    private PostService postService;

    @Operation(summary = "Get all posts", description = "Get all posts")
    @GetMapping("")
    public List<Post> getAll() {
        return this.postService.getAll();
    }

    @Operation(summary = "Get post by id", description = "Get post by id")
    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id) {
        return this.postService.getById(id);
    }

    @Operation(summary = "Create post", description = "Create post")
    @PostMapping("")
    public Post create(@RequestBody Post post) {
        return this.postService.create(post);
    }

    @Operation(summary = "Update post", description = "Update post")
    @PutMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        return this.postService.update(id, post);
    }

    @Operation(summary = "Delete post", description = "Delete post")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.postService.delete(id);
    }
}
