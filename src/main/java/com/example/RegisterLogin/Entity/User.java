package com.example.RegisterLogin.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id

    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;

    @Column(name = "user_fullname",length = 255)
    private String userfullname;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "user_name", length = 50)
    private String userName;

    @Column(name = "password", length = 255)
    private String password;





    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", userfullname='" + userfullname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
