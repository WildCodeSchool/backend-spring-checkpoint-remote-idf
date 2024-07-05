package checkpoint.spring.remote.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import checkpoint.spring.remote.entity.User;

@Component
public class UserGeneratorRepository implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if(this.userRepository.count() == 0) {
            List<User> users = new ArrayList<>();

            users.add(new User("Joe", "Start"));
            users.add(new User("Baden", "Powell"));

            this.userRepository.saveAll(users);
        }
    }
}
