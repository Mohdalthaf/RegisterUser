package com.example.RegisterLogin.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class AdditionalInfoDTO {

    private Long userid;
    private String annualIncome;
    private String countryOfBirth;
    private BigDecimal netWorth;
    private String sourceOfIncome;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date netWorthDate;
    private String occupation;
    private Boolean polExpPerson;
    private Boolean taxPayer;

    // Constructors, getters, and setters

    public AdditionalInfoDTO() {
    }

    public AdditionalInfoDTO(Long userid, String annualIncome, String countryOfBirth, BigDecimal netWorth,
                             String sourceOfIncome, Date netWorthDate, String occupation,
                             Boolean polExpPerson, Boolean taxPayer) {
        this.userid = userid;
        this.annualIncome = annualIncome;
        this.countryOfBirth = countryOfBirth;
        this.netWorth = netWorth;
        this.sourceOfIncome = sourceOfIncome;
        this.netWorthDate = netWorthDate;
        this.occupation = occupation;
        this.polExpPerson = polExpPerson;
        this.taxPayer = taxPayer;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public BigDecimal getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public Date getNetWorthDate() {
        return netWorthDate;
    }

    public void setNetWorthDate(Date netWorthDate) {
        this.netWorthDate = netWorthDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Boolean getPolExpPerson() {
        return polExpPerson;
    }

    public void setPolExpPerson(Boolean polExpPerson) {
        this.polExpPerson = polExpPerson;
    }

    public Boolean getTaxPayer() {
        return taxPayer;
    }

    public void setTaxPayer(Boolean taxPayer) {
        this.taxPayer = taxPayer;
    }
}

