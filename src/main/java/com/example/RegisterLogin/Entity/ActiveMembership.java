package com.example.RegisterLogin.Entity;

import javax.persistence.*;

@Entity
@Table(name = "active_memberships")
public class ActiveMembership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long membership_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private NomineeDetails nomineeDetails;

    private String membership_status;

    // Getters and setters
}

