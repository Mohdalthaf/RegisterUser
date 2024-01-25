package com.example.RegisterLogin.Service.impl;


import com.example.RegisterLogin.Dto.ProfileDTO;
import com.example.RegisterLogin.Entity.Profile;
import com.example.RegisterLogin.Repo.NomineeDetailsRepository;
import com.example.RegisterLogin.Repo.PersonalDetailRepository;
import com.example.RegisterLogin.Repo.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    private final PersonalDetailRepository personalDetailRepository;

    @Autowired
    private NomineeDetailsRepository nomineeDetailsRepository;

    public ProfileService(PersonalDetailRepository personalDetailRepository) {
        this.personalDetailRepository = personalDetailRepository;
    }


    public ProfileDTO getProfileDetails(Long userId) {
        Profile profile = profileRepository.findById(userId).orElse(null);

        if (profile != null) {
            ProfileDTO profileDTO = new ProfileDTO();
            profileDTO.setName(profile.getPersonalDetail().getName());
            profileDTO.setRelationship(profile.getNomineeDetails().getRelationship());

            profileDTO.setNominee_details(profile.getNomineeDetails().getNominee_authentication_status());



            return profileDTO;
        }

        return null;
    }
}
