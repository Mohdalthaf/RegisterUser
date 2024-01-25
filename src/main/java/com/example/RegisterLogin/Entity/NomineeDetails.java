package com.example.RegisterLogin.Entity;
import javax.persistence.*;

@Entity
@Table(name = "nominee_details")
public class NomineeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nominee_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private PersonalDetails personalDetails;

    private String relationship;
    private String nominee_authentication_status;

    // Getters and setters
}

