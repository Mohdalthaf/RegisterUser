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

    @PostMapping
    public ResponseEntity<Object> createProfile(@RequestBody ProfileDTO profileDTO) {
        Profile createdProfile = profileService.createProfile(profileDTO);
        return ResponseEntity.ok(createdProfile);
    }

    // Other endpoints as needed
}

