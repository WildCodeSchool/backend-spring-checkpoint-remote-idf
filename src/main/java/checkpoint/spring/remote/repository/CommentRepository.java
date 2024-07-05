package checkpoint.spring.remote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import checkpoint.spring.remote.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    
} 