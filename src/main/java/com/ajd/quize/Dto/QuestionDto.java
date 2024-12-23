package com.ajd.quize.Dto;

import com.ajd.quize.Entity.Question;
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

public class QuestionDto {
    private int id;
    private int idQuiz;
    private String question;

    public static QuestionDto questionEntityToDto(Question question){
        return (question==null)? null: QuestionDto.builder()
                .id(question.getId())
                .idQuiz(question.getIdQuiz())
                .question(question.getQuestion())
                .build();

    }
    public static Question  questionDtoToEntity(QuestionDto questionDto){
        return (questionDto==null)? null:  Question.builder()
                .id(questionDto.getId())
                .idQuiz(questionDto.getIdQuiz())
                .question(questionDto.getQuestion())
                .build();

    }
}
