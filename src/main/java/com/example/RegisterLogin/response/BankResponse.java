package com.example.RegisterLogin.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BankResponse {
    String Message;
    Boolean status;
    int userid;
    String name;

    @Override
    public String toString() {
        return "BankResponse{" +
                "Message='" + Message + '\'' +
                ", status=" + status +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                '}';
    }
}
