package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepo;

     @GetMapping("")
    public List<User> getAll() {
       
        List<User> Users = this.userRepo.findAllByName();  
        return Users;
    }

}
