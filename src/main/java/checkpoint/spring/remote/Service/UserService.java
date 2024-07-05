package checkpoint.spring.remote.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.Entity.User;
import checkpoint.spring.remote.Repository.UserRepository;

@Service
public class UserService {


     @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        this.userRepository.save(new User("John", "Doe"));
        this.userRepository.save(new User("Fred", "sfrge"));
        this.userRepository.save(new User("Leo", "Dosdgde"));
        this.userRepository.save(new User("Pierre", "Dodgdfe"));
        this.userRepository.save(new User("Lea", "Dsdfsdoe"));
        this.userRepository.save(new User("Lilie", "Dosdfe"));
        this.userRepository.save(new User("Nat", "Dzfseroe"));
        List<User> users = this.userRepository.findAll();
        return users;
    }

   
    public User getById(Long id) {
        User user = this.userRepository.findById(id).get();
        return user;
    }
    
    public User updateUSer(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
