package com.ajd.quize.Service;

import com.ajd.quize.Dto.UserDto;

/**
 * @author Arejdal
 **/
public interface UserService {
    UserDto save(UserDto userDto);
    UserDto findbyEmailAndPassword(String email,String password);
    UserDto findByEmail(String email);
}
