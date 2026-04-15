package com.project.user.management.service;

import java.util.List;

import com.project.user.management.dto.UsersRequestDto;
import com.project.user.management.dto.UsersResponseDto;
import com.project.user.management.dto.UsersUpdateRequestDto;
import com.project.user.management.entity.Users;

public interface UsersService {

    String register(UsersRequestDto user);

    UsersResponseDto searchUser(Long id);

    List<UsersResponseDto> viewAllUsers();

    UsersResponseDto updateUser(UsersUpdateRequestDto userDto);

    String deleteUser(Long id);
}