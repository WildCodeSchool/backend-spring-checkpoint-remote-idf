package checkpoint.spring.remote.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import checkpoint.spring.remote.entity.Post;
import checkpoint.spring.remote.entity.User;

@Component
public class PostGeneratorRepository implements CommandLineRunner {
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        if(this.postRepository.count() == 0) {
            List<Post> posts = new ArrayList<>();

            posts.add(new Post("Lorem ipsum dolor sit amet consectetur adipisicing elit. Facere non excepturi quo in! Est cupiditate", "https://www.change-your-home.com/wp-content/uploads/2019/10/meuse-chasse-balle-pied-770x400.jpg", new User("Joe", "Start")));

            this.postRepository.saveAll(posts);
        }
    }
}
