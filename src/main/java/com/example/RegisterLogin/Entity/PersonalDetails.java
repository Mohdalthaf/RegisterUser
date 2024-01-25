package com.example.RegisterLogin.Entity;
import javax.persistence.*;

@Entity
@Table(name = "personal_details")
public class PersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String name;
    private String phone_no;

    // Getters and setters
}
