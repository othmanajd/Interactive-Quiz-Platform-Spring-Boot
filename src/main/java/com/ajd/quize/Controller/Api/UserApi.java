package com.ajd.quize.Controller.Api;

import com.ajd.quize.Dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Arejdal
 **/
@RequestMapping("/api/User")
public interface UserApi {
    @PostMapping("/Ajouter")
    ResponseEntity<UserDto> save(@RequestBody UserDto utilisateurDto);
    @PostMapping("/connexion")
    ResponseEntity<UserDto> find(@RequestBody UserDto userDto);
}
