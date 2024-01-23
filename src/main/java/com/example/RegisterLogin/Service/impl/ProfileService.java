package com.example.RegisterLogin.Service.impl;


import com.example.RegisterLogin.Dto.ProfileDTO;
import com.example.RegisterLogin.Entity.Profile;
import com.example.RegisterLogin.Repo.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {
    private final ProfileRepository profileRepository;

    public Profile createProfile(ProfileDTO profileDTO) {
        Profile profile = new Profile();
        profile.setName(profileDTO.getName());
        profile.setRelationshipStatus(profileDTO.getRelationshipStatus());
        profile.setPhoneNumber(profileDTO.getPhoneNumber());
        return profileRepository.save(profile);
    }

    // Other methods as needed
}

