package com._3to1.pet.model.service;

import com._3to1.pet.model.UserDto;
import com._3to1.pet.model.mapper.UserMapper;
import org.apache.catalina.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSeriveImpl implements UserServie {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public UserDto login(UserDto userDto) throws Exception {
        if(userDto.getEmail() == null && userDto.getPassword() == null)
            return null;

        return sqlSession.getMapper(UserMapper.class).login(userDto);
    }

    @Override
    public Optional<UserDto> userInfo(String email) throws Exception {
        return sqlSession.getMapper(UserMapper.class).userInfo(email);
    }
}
