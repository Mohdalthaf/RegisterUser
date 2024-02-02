package com.example.RegisterLogin.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "bankdetails_tbl")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Bank {

    @Id

    @Column(name = "accid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accid;

    @Column(name = "userid")
    private String userid;

    @Column(name = "acctype", length = 50)
    private String acctype;

    @Column(name = "accno", length = 30)
    private String accno;

    @Column(name = "ifsccode", length = 25)
    private String ifsccode;

    public Bank() {
    }

    public Bank(String userid, String acctype, String accno, String ifsccode) {
        this.accid = accid;
        this.userid = userid;
        this.acctype = acctype;
        this.accno = accno;
        this.ifsccode = ifsccode;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accid=" + accid +
                ", userid='" + userid + '\'' +
                ", acctype='" + acctype + '\'' +
                ", accno='" + accno + '\'' +
                ", ifsccode='" + ifsccode + '\'' +
                '}';
    }
}
