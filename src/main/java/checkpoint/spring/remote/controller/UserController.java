package com.wild.checkpoint.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wild.checkpoint.demo.Entity.User;
import com.wild.checkpoint.demo.Service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User show(@PathVariable Long id){
        return this.userService.getUser(id);
    }

    @PostMapping("/users")
    public User create(@RequestBody User user){
        return this.userService.createUser(user);

    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        return this.userService.updateUser(id, user);
    }

    @DeleteMapping("/users/{id}")
    public boolean delete(@PathVariable Long id){
        return this.userService.deleteUser(id);
    }
}