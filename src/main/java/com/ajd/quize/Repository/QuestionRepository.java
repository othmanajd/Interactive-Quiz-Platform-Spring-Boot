package com.ajd.quize.Repository;

import com.ajd.quize.Entity.Question;
import com.ajd.quize.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Arejdal
 **/
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findAllByIdQuiz(int idQuiz);
}
