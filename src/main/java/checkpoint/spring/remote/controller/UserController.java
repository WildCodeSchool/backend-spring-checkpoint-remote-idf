package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.entity.User;
import checkpoint.spring.remote.service.UserService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @Operation(summary = "Get all users")
    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @Operation(summary = "Get user by id")
    @GetMapping("/{id}")
    public User getUserById(Long id){
        return userService.getUserById(id);
    }
}
