package com.example.RegisterLogin.Controller;

import com.example.RegisterLogin.Dto.PersonalDetailsDTO;
import com.example.RegisterLogin.Entity.PersonalDetails;
import com.example.RegisterLogin.Service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personal-details")
public class PersonalDetailsController {

    @Autowired
    private PersonalDetailsService personalDetailsService;

    @PostMapping
    public ResponseEntity<PersonalDetails> addPersonalDetails(@RequestBody PersonalDetailsDTO personalDetailsDTO) {
        // Convert DTO to entity
        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setUserId(personalDetailsDTO.getUserId());
        personalDetails.setAddress(personalDetailsDTO.getAddress());
        personalDetails.setDateOfBirth(personalDetailsDTO.getDateOfBirth());
        personalDetails.setPanNumber(personalDetailsDTO.getPanNumber());
        personalDetails.setAadharNumber(personalDetailsDTO.getAadharNumber());

        PersonalDetails savedPersonalDetails = personalDetailsService.savePersonalDetails(personalDetails);
        return new ResponseEntity<>(savedPersonalDetails, HttpStatus.CREATED);
    }

    // Other endpoints for CRUD operations
}
