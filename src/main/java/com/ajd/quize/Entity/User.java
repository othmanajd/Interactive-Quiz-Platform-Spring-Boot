package com.ajd.quize.Entity;

import com.ajd.quize.Role.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Arejdal
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING) // Pour texte (PROF, ETUDIANT)
    private UserRole role;
    @Version
    private Integer version;
}
