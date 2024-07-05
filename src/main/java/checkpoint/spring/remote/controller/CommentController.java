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

import checkpoint.spring.remote.entity.Comment;
import checkpoint.spring.remote.service.CommentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/comments")
public class CommentController {
    
    @Autowired
    private CommentService commentService;

    @Operation(summary = "Get all comments", description = "Get all comments")
    @GetMapping("")
    public List<Comment> getAll() {
        return this.commentService.getAll();
    }

    @Operation(summary = "Get comment by id", description = "Get comment by id")
    @GetMapping("/{id}")
    public Comment getById(@PathVariable Long id) {
        return this.commentService.getById(id);
    }

    @Operation(summary = "Create comment", description = "Create comment")
    @PostMapping("")
    public Comment create(@RequestBody Comment comment) {
        return this.commentService.create(comment);
    }

    @Operation(summary = "Update comment", description = "Update comment")
    @PutMapping("/{id}")
    public Comment update(@PathVariable Long id, @RequestBody Comment comment) {
        return this.commentService.update(id, comment);
    }

    @Operation(summary = "Delete comment", description = "Delete comment")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.commentService.delete(id);
    }
}
