package com.example.RegisterLogin.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalInfoResponse {
    String Message;
    Boolean status;
    int userid;
    String name;
    @Override
    public String toString() {
        return "AdditionalInfoResponse{" +
                "Message='" + Message + '\'' +
                ", status=" + status +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                '}';
    }
}



