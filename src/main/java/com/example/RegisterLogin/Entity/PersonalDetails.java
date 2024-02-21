package com.example.RegisterLogin.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Personal_Details_tbl")
public class PersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column(name = "user_id")
    private Long userId;

    private String address;

    @Column(name = "dateofbirth")
    private Date dateOfBirth;

    @Column(name = "pan_number")
    private String panNumber;

    @Column(name = "aadhar_number")
    private String aadharNumber;

    public PersonalDetails() {
    }

    public PersonalDetails(Long userId, String address, Date dateOfBirth, String panNumber, String aadharNumber) {
        this.userId = userId;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
    }

    // Getters and setters
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
}