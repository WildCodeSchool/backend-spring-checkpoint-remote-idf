package com.example.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.User;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
    public List<User> findAllByName();
    
}
