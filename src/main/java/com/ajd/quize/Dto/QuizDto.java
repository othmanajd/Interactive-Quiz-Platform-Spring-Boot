package com.ajd.quize.Dto;

import com.ajd.quize.Entity.Quiz;
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
public class QuizDto {
    private int id;
    private int idCours;
    private String titre;

    public static QuizDto quizEntityToDto(Quiz quiz){
        return (quiz==null)? null: QuizDto.builder()
                .id(quiz.getId())
                .idCours(quiz.getIdCours())
                .titre(quiz.getTitre())
                .build();

    }
    public static Quiz quizDtoToEntity(QuizDto quizDto){
        return (quizDto==null)? null:  Quiz.builder()
                .id(quizDto.getId())
                .idCours(quizDto.getIdCours())
                .titre(quizDto.getTitre())
                .build();
    }
}
