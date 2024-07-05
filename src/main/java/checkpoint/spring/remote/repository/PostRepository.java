package checkpoint.spring.remote.repository;

import checkpoint.spring.remote.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long > {
}
