package com.example.RegisterLogin.Service.impl;


import com.example.RegisterLogin.Dto.ProfileDTO;
import com.example.RegisterLogin.Entity.ActiveMembership;
import com.example.RegisterLogin.Entity.Profile;
import com.example.RegisterLogin.Repo.ActiveMembershipRepository;
import com.example.RegisterLogin.Repo.NomineeDetailsRepository;
import com.example.RegisterLogin.Repo.PersonalDetailRepository;
import com.example.RegisterLogin.Repo.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private PersonalDetailRepository personalDetailsRepository;

    @Autowired
    private NomineeDetailsRepository nomineeDetailsRepository;

    @Autowired
    private ActiveMembershipRepository activeMembershipRepository;

    public ProfileDTO getProfileDetails(Long userId) {
        Profile profile = profileRepository.findById(userId).orElse(null);

        if (profile != null) {
            ProfileDTO profileDTO = new ProfileDTO();
            profileDTO.setName(profile.getPersonalDetails().getName());
            profileDTO.setRelationship(profile.getNomineeDetails().getRelationship());
            profileDTO.setPhone_no(profile.getPersonalDetails().getPhone_no());
            profileDTO.setNominee_details(profile.getNomineeDetails().getNominee_authentication_status());

            ActiveMembership activeMembership = activeMembershipRepository.findByNomineeDetails(profile.getNomineeDetails());
            if (activeMembership != null) {
                profileDTO.setMembership_status(activeMembership.getMembership_status());
            }

            return profileDTO;
        }

        return null;
    }
}



