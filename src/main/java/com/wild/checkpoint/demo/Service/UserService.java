package com.wild.checkpoint.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.wild.checkpoint.demo.Entity.User;
import com.wild.checkpoint.demo.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public List<User> GetUsers(){
        return this.userRepository.findAll();
    }

    public User GetUser(Long id){
        return this.userRepository.findById(id).get();
    }

    public User CreateUser(@RequestBody User user){
        return this.userRepository.save(user);

    }

    public User UpdateUser(@PathVariable Long id, @RequestBody User user){
        User userToUpdate = this.userRepository.findById(id).get();
        userToUpdate.setFirstname(user.getFirstname());
        userToUpdate.setLastname(user.getLastname());
        userToUpdate.setImageUrl(user.getImageUrl());
        userToUpdate.setPosts(user.getPosts());
        return this.userRepository.save(userToUpdate);
    }

    public boolean DeleteUser(@PathVariable Long id){
        this.userRepository.deleteById(id);
        return true;
    }
}
