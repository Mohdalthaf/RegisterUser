package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Dto.UserDTO;
import com.example.RegisterLogin.Entity.User;
import com.example.RegisterLogin.Repo.UserRepo;
import com.example.RegisterLogin.Service.UserService;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public String addUser(UserDTO userDTO) {
        String userId=generateUserId();
        Integer intValue = Integer.parseInt(userId);
        User user = new User(
                intValue,
                userDTO.getUserfullname(),
                userDTO.getPhoneNumber(),
                userDTO.getUserName(),
                userDTO.getPassword()
//                this.passwordEncoder.encode(userDTO.getPassword())
        );

        userRepo.save(user);
        return user.getUserfullname();
    }


    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";

        User user1 = userRepo.findByUserName(loginDTO.getEmail());
        if (user1 != null) {
            String storedPassword = loginDTO.getPassword();
            String userProvidedPassword = user1.getPassword();

            // Check if the provided password matches the stored password
            if (storedPassword.equals(userProvidedPassword)) {
                // Passwords match, login successful
                return new LoginResponse("Login Success", true,user1.getUserfullname());
            } else {
                // Passwords do not match, login failed
                return new LoginResponse("Login Failed", false,null);
            }
        } else {
            // User not found, indicate that the email does not exist
            return new LoginResponse("Email not exists", false,null);
        }
    }
    public String generateUserId() {
        Random obj = new Random();
        char[] otp = new char[4];
        for (int i = 0; i < 4; i++) {
            otp[i] = (char) (obj.nextInt(10) + 48);
        }
        return String.valueOf(otp);
    }
}
