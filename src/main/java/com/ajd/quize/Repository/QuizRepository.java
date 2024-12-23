package com.ajd.quize.Repository;

import com.ajd.quize.Entity.Quiz;
import com.ajd.quize.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Arejdal
 **/
public interface QuizRepository extends JpaRepository<Quiz, Integer> {
}
