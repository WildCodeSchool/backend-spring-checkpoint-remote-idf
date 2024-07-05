package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.repository.CommentRepository;
import checkpoint.spring.remote.entity.Comment;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;
    
    @GetMapping("")
    public List<Comment> getAll() {
        return this.commentRepository.findAll();
    }
}
