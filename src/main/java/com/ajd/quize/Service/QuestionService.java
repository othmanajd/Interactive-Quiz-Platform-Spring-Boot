package com.ajd.quize.Service;

import com.ajd.quize.Dto.QuestionDto;
import com.ajd.quize.Dto.QuizDto;

import java.util.List;

/**
 * @author Arejdal
 **/
public interface QuestionService {
    QuestionDto save(QuestionDto questionDto);
    List<QuestionDto> findAllQuestionForQuiz(QuizDto quizDto);
}
