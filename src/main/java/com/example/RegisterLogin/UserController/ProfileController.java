package com.example.RegisterLogin.UserController;



import com.example.RegisterLogin.Dto.ProfileDTO;
import com.example.RegisterLogin.Entity.Profile;
import com.example.RegisterLogin.Service.impl.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileService profileService;


    @PostMapping("/profiles")
    public ResponseEntity<String> createProfile(@RequestBody ProfileDTO profileDTO) {
        // Your logic to save the profile
        return ResponseEntity.ok("Profile created successfully");
    }


    // Other endpoints as needed
}

