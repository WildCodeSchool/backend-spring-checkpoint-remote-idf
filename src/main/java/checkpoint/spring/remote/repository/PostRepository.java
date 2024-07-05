package checkpoint.spring.remote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import checkpoint.spring.remote.entity.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
