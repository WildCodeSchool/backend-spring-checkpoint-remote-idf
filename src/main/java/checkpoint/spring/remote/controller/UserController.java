package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import checkpoint.spring.remote.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Operation(summary = "Get all users", description = "Get all users")
    @GetMapping("")
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @Operation(summary = "Get user by Id", description = "Get user by Id")
    @PostMapping("")
    public User createUser(@RequestBody User user) {
        User newUser = this.userRepository.save(user);
        return newUser;
    }

    @Operation(summary = "Update user", description = "Update user")
    @PostMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        User updateUser = this.userRepository.findById(id).get();
        updateUser.setFisrtname(user.getFirstname());
        updateUser.setLastname(user.getLastname());
        return this.userRepository.save(updateUser);
    }

    @Operation(summary = "Delete user", description = "Delete user")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.userRepository.deleteById(id);
    }
}
