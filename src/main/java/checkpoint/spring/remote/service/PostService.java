package checkpoint.spring.remote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.entity.Post;
import checkpoint.spring.remote.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAll() {
        List<Post> posts = this.postRepository.findAll();
        return posts;
    }
    
}
