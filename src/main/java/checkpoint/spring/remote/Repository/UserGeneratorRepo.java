package checkpoint.spring.remote.Repository;

import checkpoint.spring.remote.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserGeneratorRepo implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {
        if(userRepo.count() == 0) {
            List<User> users = new ArrayList<>();

            users.add(new User("Joe","Start"));
            users.add(new User("Baden","Powell"));
            userRepo.saveAll(users);

        }
    }


}
