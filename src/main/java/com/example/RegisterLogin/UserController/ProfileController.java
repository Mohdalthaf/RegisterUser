package com.example.RegisterLogin.UserController;// ProfileController.java
import com.example.RegisterLogin.Entity.User;
import com.example.RegisterLogin.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<User> getProfileData(@PathVariable Integer userId) {
        User profileData = profileService.getProfileData(userId);
        return new ResponseEntity<>(profileData, HttpStatus.OK);
    }
}
