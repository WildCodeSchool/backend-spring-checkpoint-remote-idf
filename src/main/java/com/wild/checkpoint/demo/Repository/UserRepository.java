package com.wild.checkpoint.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wild.checkpoint.demo.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
