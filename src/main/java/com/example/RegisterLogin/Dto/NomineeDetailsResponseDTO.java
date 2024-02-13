package com.example.RegisterLogin.Dto;

public class NomineeDetailsResponseDTO {

    private String message;

    public NomineeDetailsResponseDTO(String message) {
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }
}
