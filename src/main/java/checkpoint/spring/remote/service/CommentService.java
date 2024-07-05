package checkpoint.spring.remote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.entity.Comment;
import checkpoint.spring.remote.repository.CommentRepository;


@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAll() {
        List<Comment> comments = this.commentRepository.findAll();
        return comments;
    }

    public Comment getById(Long id) {
        Comment comment = this.commentRepository.findById(id).get();
        return comment;
    }

     public Comment create(Comment comment) {
        Comment createdComment = this.commentRepository.save(comment);
        return createdComment;
    }

    public Comment update(Long id, Comment comment) {
        Comment retrievedComment = this.commentRepository.findById(id).get();
        retrievedComment.setMessage(comment.getMessage());
        Comment updatedComment = this.commentRepository.save(comment);
        return updatedComment;
    }

    public void delete(Long id) {
        this.commentRepository.deleteById(id);
    }
}
