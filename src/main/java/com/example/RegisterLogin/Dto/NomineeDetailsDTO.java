package com.example.RegisterLogin.Dto;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;

// NomineeDetailsDTO.java
public class NomineeDetailsDTO {

    @Column(name = "userid")
    private Long userid;

    private String nomineename;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateofbirth;
    private String relationship;

    private boolean noNominee;

    public NomineeDetailsDTO() {
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getNomineename() {
        return nomineename;
    }

    public void setNomineename(String nomineename) {
        this.nomineename = nomineename;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
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
        return "NomineeDetailsDTO{" +
                "userid=" + userid +
                ", nomineename='" + nomineename + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", relationship='" + relationship + '\'' +
                ", noNominee=" + noNominee +
                '}';
    }
}


