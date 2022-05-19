package com._3to1.pet.model.mapper;

import com._3to1.pet.model.UserDto;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.Optional;


@Mapper
public interface UserMapper {
    public UserDto login(UserDto userDto) throws SQLException;
    public Optional<UserDto> userInfo(String email) throws SQLException;
}
