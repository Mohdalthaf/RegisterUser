package com.example.RegisterLogin.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "additionalinfo_tbl")
public class AdditionalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "add_id")
    private Long addId;

    @Column(name = "userid")
    private Long userId;
    @Column(name = "annual_income")
    private String annualIncome;
    @Column(name = "country_of_birth")
    private String countryOfBirth;
    @Column(name = "net_worth")
    private BigDecimal netWorth;
    @Column(name = "source_of_income")
    private String sourceOfIncome;
    @Column(name = "net_worth_date")
    private Date netWorthDate;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "pol_exp_person")
    private Boolean polExpPerson;
    @Column(name = "tax_payer")
    private Boolean taxPayer;

    public AdditionalInfo(Long userId, String annualIncome, String countryOfBirth, BigDecimal netWorth, String sourceOfIncome, Date netWorthDate, String occupation, Boolean polExpPerson, Boolean taxPayer) {
    }

    public Long getAddId() {
        return addId;
    }

    public void setAddId(Long addId) {
        this.addId = addId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public AdditionalInfo() {
    }


    // Constructors, getters, and setters

}
