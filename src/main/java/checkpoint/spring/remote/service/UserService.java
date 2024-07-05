package checkpoint.spring.remote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.entity.User;
import checkpoint.spring.remote.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        List<User> users = this.userRepository.findAll();
        return users;
    }

    public User getById(Long id) {
        User user = this.userRepository.findById(id).get();
        return user;
    }

     public User create(User user) {
        User createdUser = this.userRepository.save(user);
        return createdUser;
    }

    public User update(Long id, User user) {
        User retrievedUser = this.userRepository.findById(id).get();
        retrievedUser.setFirstname(user.getFirstname());
        retrievedUser.setLastname(user.getLastname());
        User updatedUser = this.userRepository.save(user);
        return updatedUser;
    }

    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }
}
