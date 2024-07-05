package checkpoint.spring.remote.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import checkpoint.spring.remote.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
