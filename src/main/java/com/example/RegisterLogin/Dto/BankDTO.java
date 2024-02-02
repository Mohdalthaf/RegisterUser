package com.example.RegisterLogin.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BankDTO {
    private int accid;
    private int userid;
    private String acctype;
    private String accno;
    private String ifsccode;

    @Override
    public String toString() {
        return "BankDTO{" +
                "accid=" + accid +
                ", userid=" + userid +
                ", acctype='" + acctype + '\'' +
                ", accno='" + accno + '\'' +
                ", ifsccode='" + ifsccode + '\'' +
                '}';
    }
}
