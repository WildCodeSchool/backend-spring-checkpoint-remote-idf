package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.repository.UserRepository;
import checkpoint.spring.remote.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("")
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        User newUser = this.userRepository.save(user);
        return newUser;
    }
}
