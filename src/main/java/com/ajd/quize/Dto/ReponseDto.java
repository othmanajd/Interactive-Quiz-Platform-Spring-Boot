package com.ajd.quize.Dto;

import com.ajd.quize.Entity.Reponse;
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
public class ReponseDto {
    private int id;
    private int idQuestion;
    private String reponse;
    private Boolean estCorrect;
    public static ReponseDto reponseEntityToDto(Reponse reponse ){
        return (reponse==null)? null: ReponseDto.builder()
                .id(reponse.getId())
                .idQuestion(reponse.getIdQuestion())
                .reponse(reponse.getReponse())
                .estCorrect(reponse.getEstCorrect())
                .build();
    }
    public static Reponse reponseDtoToEntity(ReponseDto reponseDto ){
        return (reponseDto==null)? null:  Reponse.builder()
                .id(reponseDto.getId())
                .idQuestion(reponseDto.getIdQuestion())
                .reponse(reponseDto.getReponse())
                .estCorrect(reponseDto.getEstCorrect())
                .build();
    }
}
