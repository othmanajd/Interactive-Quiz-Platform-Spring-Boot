package com.ajd.quize.Repository;

import com.ajd.quize.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Arejdal
 **/
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    User findByEmailAndPassword(String email,String password);
}
