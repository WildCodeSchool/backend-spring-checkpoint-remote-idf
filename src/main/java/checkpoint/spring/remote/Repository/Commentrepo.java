package checkpoint.spring.remote.Repository;

import checkpoint.spring.remote.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Commentrepo extends JpaRepository<Comment, Long> {
}
