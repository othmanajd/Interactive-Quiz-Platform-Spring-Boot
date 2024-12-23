package com.ajd.quize.Service.ServiceImpliment;

import com.ajd.quize.Dto.QuestionDto;
import com.ajd.quize.Dto.QuizDto;
import com.ajd.quize.Dto.ReponseDto;
import com.ajd.quize.Repository.QuizRepository;
import com.ajd.quize.Service.QuizService;
import com.ajd.quize.Service.ReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Arejdal
 **/
@Service
public class QuizServiceImp implements QuizService {
    private final QuizRepository quizRepository;

    @Autowired
    public QuizServiceImp(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public QuizDto save(QuizDto quizDto) {
        quizRepository.save(QuizDto.quizDtoToEntity(quizDto));
        return quizDto;
    }
}
