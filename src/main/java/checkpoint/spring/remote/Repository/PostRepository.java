package checkpoint.spring.remote.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import checkpoint.spring.remote.Entity.Post;


public interface PostRepository  extends JpaRepository<Post, Long> {

}
