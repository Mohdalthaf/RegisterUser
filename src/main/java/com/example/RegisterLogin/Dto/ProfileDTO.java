package com.example.RegisterLogin.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileDTO {

    private String name;
    private String relationship;
    private String phone_no;
    private String nominee_details;
    private String membership_status;

    // Manually added getter methods
    public String getName() {
        return name;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getNominee_details() {
        return nominee_details;
    }

    public String getMembership_status() {
        return membership_status;
    }

    // Manually added setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public void setNominee_details(String nominee_details) {
        this.nominee_details = nominee_details;
    }

    public void setMembership_status(String membership_status) {
        this.membership_status = membership_status;
    }

    public String getNominee_authentication_status() {

        return null;
    }
}



