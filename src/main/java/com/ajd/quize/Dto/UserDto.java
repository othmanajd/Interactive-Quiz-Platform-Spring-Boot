package com.ajd.quize.Dto;

import com.ajd.quize.Entity.User;
import com.ajd.quize.Role.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Arejdal
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String name;
    private String email;
    private String password;
    private UserRole role;

    public static UserDto  userEntityToDto(User user){
        return (user==null)? null: UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
    }
    public static User  userDtoToEntity(UserDto userDto){
        return (userDto==null)? null: User.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .role(userDto.getRole())
                .build();
    }
}