package user.management.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import user.management.Entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // Find by email (for login)
     Optional<UserEntity>findByEmail(String email);

    // Find by username
     Optional<UserEntity>findByUserName(String userName);

    // Check if email already exists
     boolean existsByEmail(String email);

    // Check if username already exists
     boolean existsByUserName(String userName);


}
