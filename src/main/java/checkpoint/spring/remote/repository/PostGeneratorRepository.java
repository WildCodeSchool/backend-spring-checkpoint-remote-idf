package checkpoint.spring.remote.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import checkpoint.spring.remote.entity.Comment;
import checkpoint.spring.remote.entity.Post;
@Component
public class PostGeneratorRepository implements CommandLineRunner {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void run(String... args) throws Exception {
        if(this.postRepository.count() == 0 && this.commentRepository.count() == 0){
            List<Post> posts = new ArrayList<>();
            List<Comment> comments = new ArrayList<>();

            posts.add(new Post("hello new post", "https://www.change-your-home.com/wp-content/uploads/2019/10/meuse-chasse-balle-pied-770x400.jpg"));

            comments.add(new Comment("c'est vraiment joli post", posts.get(0)));

            this.postRepository.saveAll(posts);
            this.commentRepository.saveAll(comments);
            
        }
    }
    
}
