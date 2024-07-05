package checkpoint.spring.remote.Service;

import checkpoint.spring.remote.Entity.Comment;
import checkpoint.spring.remote.Repository.Commentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    Commentrepo commentrepo;

    public List<Comment> getAll(){
        return commentrepo.findAll();
    }


}
