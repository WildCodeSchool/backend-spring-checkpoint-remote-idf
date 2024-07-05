package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.entity.Post;
import checkpoint.spring.remote.service.PostService;
import io.swagger.v3.oas.annotations.Operation;

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
    
}
