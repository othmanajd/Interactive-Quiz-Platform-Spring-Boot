package com.ajd.quize.Service.ServiceImpliment;

/**
 * @author Arejdal
 **/

import com.ajd.quize.Dto.UserDto;
import com.ajd.quize.Repository.UserRepository;
import com.ajd.quize.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto save(UserDto userDto) {
        userRepository.save(UserDto.userDtoToEntity(userDto));
        return null;
    }

    @Override
    public UserDto findbyEmailAndPassword(String email, String password) {
        return UserDto.userEntityToDto(userRepository.findByEmailAndPassword(email,password));
    }

    @Override
    public UserDto findByEmail(String email) {
        return UserDto.userEntityToDto(userRepository.findByEmail(email));
    }
}
