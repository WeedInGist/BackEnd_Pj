package com._3to1.pet.model.service;

import com._3to1.pet.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserServie {
    public UserDto login(UserDto userDto) throws Exception;
    public Optional<UserDto> userInfo(String email) throws Exception;
}
