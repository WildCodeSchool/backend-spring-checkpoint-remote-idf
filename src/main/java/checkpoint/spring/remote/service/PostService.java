package checkpoint.spring.remote.service;

import checkpoint.spring.remote.entity.Post;
import checkpoint.spring.remote.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> getAllPosts(){
        return  postRepository.findAll();
    }
}
