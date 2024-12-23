package com.ajd.quize.Service;

import com.ajd.quize.Dto.QuestionDto;
import com.ajd.quize.Dto.ReponseDto;

import java.util.List;

/**
 * @author Arejdal
 **/
public interface ReponseService {
    ReponseDto save(ReponseDto reponseDto);
    List<ReponseDto> findAllReponse(QuestionDto question);
}
