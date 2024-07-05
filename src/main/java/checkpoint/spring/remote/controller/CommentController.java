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

import checkpoint.spring.remote.repository.CommentRepository;
import io.swagger.v3.oas.annotations.Operation;
import checkpoint.spring.remote.entity.Comment;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;
    
    @Operation(summary = "Get all comments", description = "Get all comments")
    @GetMapping("")
    public List<Comment> getAll() {
        return this.commentRepository.findAll();
    }

    @Operation(summary = "Get comment by Id", description = "Get comment by Id")
    @GetMapping("/{id}")
    public Comment getById(@PathVariable Long id) {
        return this.commentRepository.findById(id).get();
    }

    @Operation(summary = "Create new comment", description = "Create new comment")
    @PostMapping("")
    public Comment create(@RequestBody Comment comment) {
        Comment newComment = this.commentRepository.save(comment);
        return newComment;
    }

    @Operation(summary = "Delete comment", description = "Delete comment")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.commentRepository.deleteById(id);
    }
}
