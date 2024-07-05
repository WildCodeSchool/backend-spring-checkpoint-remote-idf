package checkpoint.spring.remote.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.Entity.Post;
import checkpoint.spring.remote.Service.PostService;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/posts")
public class PostController {

        @Autowired
    private PostService postService;
    

       @Operation(summary = "Get all posts", description = "Get all pots")
    @GetMapping("")
    public List<Post> getAll() {
        return this.postService.getAll();
    }

}
