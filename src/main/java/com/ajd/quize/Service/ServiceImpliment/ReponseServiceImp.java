package com.ajd.quize.Service.ServiceImpliment;

import com.ajd.quize.Dto.QuestionDto;
import com.ajd.quize.Dto.ReponseDto;
import com.ajd.quize.Entity.Reponse;
import com.ajd.quize.Repository.ReponseRepository;
import com.ajd.quize.Service.ReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arejdal
 **/
@Service
public class ReponseServiceImp implements ReponseService {
    private final ReponseRepository reponseRepository;

    @Autowired
    public ReponseServiceImp(ReponseRepository reponseRepository) {
        this.reponseRepository = reponseRepository;
    }

    @Override
    public ReponseDto save(ReponseDto reponseDto) {
        reponseRepository.save(ReponseDto.reponseDtoToEntity(reponseDto));
        return reponseDto;
    }

    @Override
    public List<ReponseDto> findAllReponse(QuestionDto question) {
        return (reponseRepository.findAllByIdQuestion(question.getId()).stream()
                .map(ReponseDto::reponseEntityToDto)
                .collect(Collectors.toList()));
    }
}
