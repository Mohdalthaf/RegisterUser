package com.example.RegisterLogin.Dto;

import java.util.Date;

public class PersonalDetailsDTO {

    private Long userId;
    private String address;
    private Date dateOfBirth;
    private String panNumber;
    private String aadharNumber;

    public PersonalDetailsDTO() {
    }

    public PersonalDetailsDTO(Long userId, String address, Date dateOfBirth, String panNumber, String aadharNumber) {
        this.userId = userId;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
    }

    // Getters and setters
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
