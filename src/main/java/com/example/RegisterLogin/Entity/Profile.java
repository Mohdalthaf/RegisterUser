package com.example.RegisterLogin.Entity;
import com.example.RegisterLogin.Dto.ProfileDTO;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private PersonalDetails personalDetails;

    @OneToOne
    @JoinColumn(name = "user_id")
    private NomineeDetails nomineeDetails;

    // Other attributes specific to the profile
    private String relationship_manager;

    public ProfileDTO getPersonalDetails() {

        return null;
    }

    public ProfileDTO getNomineeDetails() {
        return null;
    }

    // Getters and setters
}



