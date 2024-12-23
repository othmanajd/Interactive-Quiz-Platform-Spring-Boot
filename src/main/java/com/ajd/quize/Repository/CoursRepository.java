package com.ajd.quize.Repository;

import com.ajd.quize.Entity.Cours;
import com.ajd.quize.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Arejdal
 **/
public interface CoursRepository extends JpaRepository<Cours, Integer> {
}
