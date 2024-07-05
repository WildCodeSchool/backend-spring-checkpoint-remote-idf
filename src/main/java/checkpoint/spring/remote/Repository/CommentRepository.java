package checkpoint.spring.remote.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import checkpoint.spring.remote.Entity.Comment;

public interface CommentRepository  extends JpaRepository<Comment, Long> {

}
