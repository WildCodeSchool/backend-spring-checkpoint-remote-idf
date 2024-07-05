package checkpoint.spring.remote.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import checkpoint.spring.remote.entity.User;
import checkpoint.spring.remote.repository.UserRepository;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
