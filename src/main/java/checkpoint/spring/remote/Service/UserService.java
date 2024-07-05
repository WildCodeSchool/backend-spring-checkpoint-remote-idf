package checkpoint.spring.remote.Service;

import checkpoint.spring.remote.Entity.User;
import checkpoint.spring.remote.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepository;

    public List<User> getUser() {
       List<User> users = userRepository.findAll();
       return users;
    }


    public User getUserById(Long id) {
       Optional<User> user =  userRepository.findById(id);
        if(user.isPresent()) {
            return user.get();
        }else
            throw new RuntimeException("Il n'y a pas de l'id " + id + " existe !");
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
