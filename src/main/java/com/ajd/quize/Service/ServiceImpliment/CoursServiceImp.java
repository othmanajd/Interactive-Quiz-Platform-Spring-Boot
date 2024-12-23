package com.ajd.quize.Service.ServiceImpliment;

import com.ajd.quize.Dto.CoursDto;
import com.ajd.quize.Repository.CoursRepository;
import com.ajd.quize.Service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Arejdal
 **/
@Service
public class CoursServiceImp implements CoursService {
    private final CoursRepository coursRepository;

    @Autowired
    public CoursServiceImp(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }
    @Override
    public CoursDto save(CoursDto coursDto) {
        coursRepository.save(CoursDto.coursDtoToEntity(coursDto));
        return coursDto;
    }
}
