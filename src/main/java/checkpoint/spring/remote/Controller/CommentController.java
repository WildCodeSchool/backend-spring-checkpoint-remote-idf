package checkpoint.spring.remote.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.Entity.Comment;
import checkpoint.spring.remote.Service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {


@Autowired
    private CommentService commentService;
    


    @GetMapping("")
    public List<Comment> getAll() {
        return this.commentService.getAll();
    }
}
