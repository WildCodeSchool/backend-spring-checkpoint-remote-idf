package checkpoint.spring.remote.Service;

import checkpoint.spring.remote.Entity.Comment;
import checkpoint.spring.remote.Entity.Post;
import checkpoint.spring.remote.Repository.Commentrepo;
import checkpoint.spring.remote.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepo postRepository;

    @Autowired
    Commentrepo commentrepo;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @PostMapping
    public Comment creat(Comment comment, long PostId) {
        Optional<Post> post = postRepository.findById(PostId);
        if (post.isPresent()) {
            comment.setPost(post.get());
        }
        return commentrepo.save(comment);
    }

}
