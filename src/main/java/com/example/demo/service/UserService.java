package com.example.demo.service;

import com.example.demo.dto.CreateUserDto;
import com.example.demo.dto.UserDto;

import java.util.List;

public interface UserService {

    long save(CreateUserDto user);

    List<UserDto> getAllUsers();

    UserDto getById(Long id);

}
