package com.ajd.quize.Controller;

import com.ajd.quize.Controller.Api.UserApi;
import com.ajd.quize.Dto.UserDto;
import com.ajd.quize.Repository.UserRepository;
import com.ajd.quize.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Arejdal
 **/
@RestController
public class UserController implements UserApi {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserDto> save(UserDto userDto) {
        return ResponseEntity.ok(userService.save(userDto));
    }

    @Override
    public ResponseEntity<UserDto> find(UserDto userDto) {
        return ResponseEntity.ok(userService.findbyEmailAndPassword(userDto.getEmail(), userDto.getPassword()));
    }


}
