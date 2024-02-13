package com.example.RegisterLogin.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileUploadDto {

    private Long userid;
    private String aadharimg;
    private String panimg;
    private String bankimg;

    // Constructors, getters, and setters

}