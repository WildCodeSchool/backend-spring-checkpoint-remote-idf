package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.entity.Comment;
import checkpoint.spring.remote.repository.CommentRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;
    
    public List<Comment> getAll() {
        return this.commentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Comment getById(@PathVariable Long id) {
        return this.commentRepository.findById(id).get();
    }

    @PostMapping("")
    public Comment create(@RequestBody Comment comment) {
        Comment newComment = this.commentRepository.save(comment);
        return newComment;
    }

    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.commentRepository.deleteById(id);
    }
}
