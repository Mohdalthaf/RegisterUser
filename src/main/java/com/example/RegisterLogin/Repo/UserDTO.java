package com.example.RegisterLogin.Repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer userid;
    private String userfullname;
    private String phoneNumber;
    private String userName;
    private String password;



    @Override
    public String toString() {
        return "UserDTO{" +
                "userid=" + userid +
                ", userfullname='" + userfullname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

