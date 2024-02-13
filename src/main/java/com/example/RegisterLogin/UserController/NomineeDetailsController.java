 package com.example.RegisterLogin.UserController;

import com.example.RegisterLogin.Dto.NomineeDetailsDTO;
import com.example.RegisterLogin.Dto.NomineeDetailsResponseDTO;
import com.example.RegisterLogin.Service.NomineeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// NomineeDetailsController.java
@RestController
@CrossOrigin
@RequestMapping("/api/nominee-details")
public class NomineeDetailsController {

    @Autowired
    private NomineeDetailsService nomineeDetailsService;

    @PostMapping("/submit")
    public ResponseEntity<NomineeDetailsResponseDTO> submitNomineeDetails(@RequestBody NomineeDetailsDTO nomineeDetailsDTO) {
        System.out.println("inside tha controller : "+nomineeDetailsDTO.toString());
        NomineeDetailsResponseDTO responseDTO = nomineeDetailsService.submitNomineeDetails(nomineeDetailsDTO);
        return ResponseEntity.ok(responseDTO);
    }
}
