package checkpoint.spring.remote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import checkpoint.spring.remote.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
