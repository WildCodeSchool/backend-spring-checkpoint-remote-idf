package checkpoint.spring.remote.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import checkpoint.spring.remote.entity.Post;

@Component
public class PostGeneratorRepository implements CommandLineRunner{
    
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        if(this.postRepository.count() == 0) {

            List<Post> posts = new ArrayList<>();

            posts.add(new Post("Come listen my new song !", "https://static.wikia.nocookie.net/gintama/images/a/a9/Zurarapper.jpg/revision/latest?cb=20100903152200"));
            posts.add(new Post("Why can't my boss be normal ?", "https://static.wikia.nocookie.net/gintama/images/3/35/Gintama_Episode_38A.png/revision/latest/scale-to-width-down/1000?cb=20130326232004"));
            posts.add(new Post("Last week, I was a cat", "https://static.wikia.nocookie.net/gintama/images/9/9b/Vlcsnap-2014-02-06-05h01m56s152.png/revision/latest?cb=20140205212501"));
        
            this.postRepository.saveAll(posts);
        }
    }
}
