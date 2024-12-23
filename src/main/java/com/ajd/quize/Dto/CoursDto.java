package com.ajd.quize.Dto;

import com.ajd.quize.Entity.Cours;
import com.ajd.quize.Entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class CoursDto {
    private int id;
    private String titre;
    private int idProf;

    public  static CoursDto coursEntityToDto(Cours cours ){
        return (cours==null)? null: CoursDto.builder()
                .id(cours.getId())
                .idProf(cours.getIdProf())
                .titre(cours.getTitre())
                .build();
    }
    public static Cours  coursDtoToEntity(CoursDto coursDto){
        return (coursDto==null)? null:  Cours.builder()
                .id(coursDto.getId())
                .idProf(coursDto.getIdProf())
                .titre(coursDto.getTitre())
                .build();
    }
}
