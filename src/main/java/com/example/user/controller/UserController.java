package com.example.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.Feed;
import com.example.user.entity.User;
import com.example.user.repository.FeedRepository;
import com.example.user.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepo;
    FeedRepository feedRepo;
     @GetMapping("")
    public List<User> getAll() {
       
        List<User> Users = this.userRepo.findAllByName();  
        return Users;
    }
      @PostMapping("")
    public User addOne(@RequestBody User user){
        user.getFirstname();
        user.getLastname();
        return this.userRepo.save(user);
    }
@GetMapping("/posts/{id}")
    public Feed getOneByUser(@PathVariable Long id) {
        Optional<User> user = this.userRepo.findById(id);
        Optional<Feed> feed = Optional.empty();
      
        if(user.isPresent() && feed.isPresent() ) {
           
            return feed.get();
        }
        throw new Error();
    }
    }

