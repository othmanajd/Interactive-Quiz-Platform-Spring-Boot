package com.ajd.quize.Service.ServiceImpliment;

import com.ajd.quize.Dto.QuestionDto;
import com.ajd.quize.Dto.QuizDto;
import com.ajd.quize.Repository.QuestionRepository;
import com.ajd.quize.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arejdal
 **/
@Service
public class QuestionServiceImp implements QuestionService {
    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImp(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public QuestionDto save(QuestionDto questionDto) {
        questionRepository.save(QuestionDto.questionDtoToEntity(questionDto));
        return questionDto;
    }

    @Override
    public List<QuestionDto> findAllQuestionForQuiz(QuizDto quizDto) {
        return (questionRepository.findAllByIdQuiz(quizDto.getId())).stream()
                .map(QuestionDto::questionEntityToDto)
                .collect(Collectors.toList());
    }
}
