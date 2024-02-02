package com.example.RegisterLogin.Service;

import com.example.loginproject.Dto.LoginDTO;
import com.example.loginproject.Dto.UserDTO;
import com.example.loginproject.response.LoginResponse;

public interface UserService {


    String addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDTO loginDTO);
}