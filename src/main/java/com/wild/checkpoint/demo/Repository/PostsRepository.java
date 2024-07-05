package com.wild.checkpoint.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wild.checkpoint.demo.Entity.Posts;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long>{
    
}
