package checkpoint.spring.remote.Controller;

import checkpoint.spring.remote.Entity.Comment;
import checkpoint.spring.remote.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;



    @GetMapping
    public List<Comment> getComments() {
        return commentService.getAll();
    }
}
