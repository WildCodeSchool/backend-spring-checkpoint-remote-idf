package checkpoint.spring.remote.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.Entity.Post;
import checkpoint.spring.remote.Repository.PostRepository;

@Service
public class PostService {

         @Autowired
    private PostRepository postRepository;

        public List<Post> getAll() {
        this.postRepository.save(new Post("Post 1", "Content 1"));

        List<Post> posts = this.postRepository.findAll();
        return posts;
    }
    
}
