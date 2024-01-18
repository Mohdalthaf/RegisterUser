package com.example.RegisterLogin.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    String Message;
    Boolean status;

    String name;


    @Override
    public String toString() {
        return "LoginResponse{" +
                "Message='" + Message + '\'' +
                ", status=" + status +
                '}';
    }
}
