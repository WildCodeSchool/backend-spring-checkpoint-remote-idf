package checkpoint.spring.remote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import checkpoint.spring.remote.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
