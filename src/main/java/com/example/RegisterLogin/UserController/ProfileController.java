package com.example.RegisterLogin.UserController;


import com.example.RegisterLogin.Dto.ProfileDTO;
import com.example.RegisterLogin.Service.impl.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{userId}")
    public ProfileDTO getProfileDetails(@PathVariable Long userId) {
        return profileService.getProfileDetails(userId);
    }
}
