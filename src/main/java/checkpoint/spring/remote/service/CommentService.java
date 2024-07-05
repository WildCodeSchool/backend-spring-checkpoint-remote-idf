package checkpoint.spring.remote.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.entity.Comment;
import checkpoint.spring.remote.repository.CommentRepository;

@Service

public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment getCommentById(Long id) {
        Optional<Comment> comment = commentRepository.findById(id);
        if (comment.isPresent()) {
            return comment.get();
        }
        throw new IllegalArgumentException("comment not found with id: " + id);
    }

    public Comment updateComment(Long id, Comment comment) {
        Optional<Comment> retrievedcomment = commentRepository.findById(id);
        if (retrievedcomment.isPresent()) {
            Comment updatedcomment = retrievedcomment.get();
            updatedcomment.setMessage(comment.getMessage());
            return commentRepository.save(updatedcomment);
        } else {
            throw new IllegalArgumentException("Comment not found with id: " + id);
        }
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
