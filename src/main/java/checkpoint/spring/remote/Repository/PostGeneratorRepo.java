package checkpoint.spring.remote.Repository;

import checkpoint.spring.remote.Entity.Comment;
import checkpoint.spring.remote.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostGeneratorRepo implements CommandLineRunner {

    @Autowired
    private PostRepo repo;

    @Autowired
    private Commentrepo commentrepo;
    @Autowired
    private PostRepo postRepo;

    @Override
    public void run(String... args) throws Exception {
        if(postRepo.count() == 0 && commentrepo.count() == 0 && repo.count() == 0) {
            List<Comment> comments = new ArrayList<>();
            List<Post> posts = new ArrayList<>();
            posts.add(new Post("Lorem ipsum dolor sit amet consectetur adipisicing elit. Facere non excepturi quo in! Est cupiditate","https://www.change-your-home.com/wp-content/uploads/2019/10/meuse-chasse-balle-pied-770x400.jpg","Anonylme",true));
            comments.add(new Comment("Super post"));
            comments.get(0).setPost(posts.get(0));

            postRepo.saveAll(posts);
            commentrepo.saveAll(comments);

        }
    }


}
