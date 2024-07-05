package checkpoint.spring.remote.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.Entity.Comment;
import checkpoint.spring.remote.Repository.CommentRepository;


@Service
public class CommentService {

             @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAll() {
        this.commentRepository.save(new Comment("Comment 1", "Content 1"));

        List<Comment> comments = this.commentRepository.findAll();
        return comments;
    }
    public Comment getById(Long id) {
        Comment comment = this.commentRepository.findById(id).get();
        return comment;
    }
    

}
