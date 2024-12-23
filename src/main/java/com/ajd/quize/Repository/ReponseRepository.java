package com.ajd.quize.Repository;

import com.ajd.quize.Entity.Reponse;
import com.ajd.quize.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Arejdal
 **/
public interface ReponseRepository extends JpaRepository<Reponse, Integer> {
    List<Reponse> findAllByIdQuestion(int idQuestion);
}
