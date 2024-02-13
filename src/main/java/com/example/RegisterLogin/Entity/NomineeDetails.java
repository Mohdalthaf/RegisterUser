package com.example.RegisterLogin.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

// NomineeDetails.java
@Entity
@Table(name = "nomineedetails_tbl")
@Data

public class NomineeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "n_id")
    private Long id;

    @Column(name = "userid")
    private Long userId;

    @Column(name = "nomineename")
    private String nomineeName;

    @Column(name = "dateofbirth")
    private LocalDate dateofBirth;

    @Column(name = "relationship")
    private String relationship;
    @Column(name = "no_nominee")
    private boolean noNominee;

    // Constructors, getters, and setters

    public NomineeDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNomineename() {
        return nomineeName;
    }

    public void setNomineename(String nomineename) {
        this.nomineeName = nomineename;
    }

    public LocalDate getDateOfBirth() {
        return dateofBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateofBirth = dateOfBirth;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public boolean isNoNominee() {
        return noNominee;
    }

    public void setNoNominee(boolean noNominee) {
        this.noNominee = noNominee;
    }

    @Override
    public String toString() {
        return "NomineeDetails{" +
                "id=" + id +
                ", userId=" + userId +
                ", nomineeName='" + nomineeName + '\'' +
                ", dateofBirth=" + dateofBirth +
                ", relationship='" + relationship + '\'' +
                ", noNominee=" + noNominee +
                '}';
    }
}

