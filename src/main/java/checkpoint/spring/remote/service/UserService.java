package checkpoint.spring.remote.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.entity.User;
import checkpoint.spring.remote.repository.UserRepository;

@Service
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

    public User getUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isPresent()) {
            return user.get();
        } else {
            throw new IllegalArgumentException("User not found with id: " + userId);
        }
    }

    public User updateUser(Long userId, User user) {
        Optional<User> retrievedUser = userRepository.findById(userId);
        if (retrievedUser.isPresent()) {
            User updateUser = retrievedUser.get();
            updateUser.setFirstname(user.getFirstname());
            updateUser.setLastname(user.getLastname());
            updateUser.setImageUrl(user.getImageUrl());
            return userRepository.save(updateUser);
        } else {
            throw new IllegalArgumentException("User not found with id: " + userId);
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
