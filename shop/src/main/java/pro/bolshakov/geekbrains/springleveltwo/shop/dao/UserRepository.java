package pro.bolshakov.geekbrains.springleveltwo.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.bolshakov.geekbrains.springleveltwo.shop.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByName(String name);
}
