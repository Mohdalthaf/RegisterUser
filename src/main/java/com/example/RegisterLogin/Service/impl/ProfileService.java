package com.example.RegisterLogin.Service.impl;// ProfileService.java
import com.example.RegisterLogin.Entity.User;
import com.example.RegisterLogin.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ProfileService {

    @Autowired
    private UserRepo userRepository;

    public User getProfileData(Integer userid) {
        User user = userRepository.findById(Math.toIntExact(userid))
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userid));

        return mapToProfileData(user);
    }

    private User mapToProfileData(User user) {
        User profileData = new User();
        profileData.setUserfullname(user.getUserfullname());
        profileData.setPhoneNumber(user.getPhoneNumber());
        return profileData;
    }
}
