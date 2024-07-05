package checkpoint.spring.remote.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import checkpoint.spring.remote.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
