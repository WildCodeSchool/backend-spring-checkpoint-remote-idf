package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Operation(summary = "Get all posts")
    @GetMapping("")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @Operation(summary = "Get post by id")
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }
}
