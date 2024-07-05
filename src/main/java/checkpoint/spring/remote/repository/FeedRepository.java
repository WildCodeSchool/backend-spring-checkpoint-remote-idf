package checkpoint.spring.remote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import checkpoint.spring.remote.entity.Feed;

public interface FeedRepository extends JpaRepository<Feed, Long> {

}
