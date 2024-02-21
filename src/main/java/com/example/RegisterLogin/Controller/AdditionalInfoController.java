//package com.example.RegisterLogin.UserController;
//import com.example.RegisterLogin.Entity.AdditionalInfo;
//import com.example.RegisterLogin.Service.AdditionalInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class AdditionalInfoController {
//    private final AdditionalInfoService additionalInfoService;
//
//    @Autowired
//    public AdditionalInfoController(AdditionalInfoService additionalInfoService) {
//        this.additionalInfoService = additionalInfoService;
//    }
//
//    @PostMapping("/submitForm")
//    public String submitForm(AdditionalInfo additionalInfo) {
//        // Implement form submission logic
//        additionalInfoService.saveAdditionalInfo(additionalInfo);
//        return "success"; // Redirect to a success page or handle accordingly
//    }
//}

package com.example.RegisterLogin.UserController;

import com.example.RegisterLogin.Dto.AdditionalInfoDTO;
import com.example.RegisterLogin.Entity.AdditionalInfo;
import com.example.RegisterLogin.Service.AdditionalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/additional-info")
public class AdditionalInfoController {

    private final AdditionalInfoService additionalInfoService;

    @Autowired
    public AdditionalInfoController(AdditionalInfoService additionalInfoService) {
        this.additionalInfoService = additionalInfoService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveAdditionalInfo(@RequestBody AdditionalInfoDTO additionalInfoDTO) {
        // Convert DTO to entity (you can use a mapper or create a method in your service for this)
        AdditionalInfo additionalInfo = convertDTOToEntity(additionalInfoDTO);

        // Save the entity
        additionalInfoService.saveAdditionalInfo(additionalInfo);

        return ResponseEntity.ok("Additional information saved successfully");
    }

    @GetMapping("/get/{addId}")
    public ResponseEntity<AdditionalInfoDTO> getAdditionalInfoById(@PathVariable Long addId) {
        // Retrieve additional information by ID
        Optional<AdditionalInfo> additionalInfoOptional = additionalInfoService.getAdditionalInfoById(addId);

        if (additionalInfoOptional.isPresent()) {
            // Convert entity to DTO (you can use a mapper or create a method in your service for this)
            AdditionalInfoDTO additionalInfoDTO = convertEntityToDTO(additionalInfoOptional.get());
            return ResponseEntity.ok(additionalInfoDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/edit/{addId}")
    public ResponseEntity<String> editAdditionalInfo(@PathVariable Long addId,
                                                     @RequestBody AdditionalInfoDTO editedInfoDTO) {
        // Convert DTO to entity (you can use a mapper or create a method in your service for this)
        AdditionalInfo editedInfo = convertDTOToEntity(editedInfoDTO);

        // Edit additional information by ID
        additionalInfoService.editAdditionalInfo(addId, editedInfo);

        return ResponseEntity.ok("Additional information edited successfully");
    }

    // Add other endpoints as needed

    // Helper method to convert DTO to entity
    private AdditionalInfo convertDTOToEntity(AdditionalInfoDTO additionalInfoDTO) {
        AdditionalInfo ado=new AdditionalInfo();

        ado.setUserId(additionalInfoDTO.getUserid());
        ado.setAnnualIncome(additionalInfoDTO.getAnnualIncome());
        ado.setCountryOfBirth(additionalInfoDTO.getCountryOfBirth());
        ado.setNetWorth(additionalInfoDTO.getNetWorth());
        ado.setSourceOfIncome(additionalInfoDTO.getSourceOfIncome());
        ado.setNetWorthDate(additionalInfoDTO.getNetWorthDate());
        ado.setOccupation(additionalInfoDTO.getOccupation());
        ado.setPolExpPerson(additionalInfoDTO.getPolExpPerson());
        ado.setTaxPayer(additionalInfoDTO.getTaxPayer());

        System.out.println(ado);
        return ado;
        


        // Implement conversion logic here
        // Create a new AdditionalInfo entity and set its properties based on the DTO
//        return new AdditionalInfo(additionalInfoDTO.getUserId(),additionalInfoDTO.getAnnualIncome(),additionalInfoDTO.getCountryOfBirth(),additionalInfoDTO.getNetWorth(),additionalInfoDTO.getSourceOfIncome(),additionalInfoDTO.getNetWorthDate(),additionalInfoDTO.getOccupation(),additionalInfoDTO.getPolExpPerson(),additionalInfoDTO.getTaxPayer());
    }

    // Helper method to convert entity to DTO
    private AdditionalInfoDTO convertEntityToDTO(AdditionalInfo additionalInfo) {
        // Implement conversion logic here
        // Create a new AdditionalInfoDTO and set its properties based on the entity
        return new AdditionalInfoDTO(additionalInfo.getUserId(),additionalInfo.getAnnualIncome(),additionalInfo.getCountryOfBirth(),additionalInfo.getNetWorth(),additionalInfo.getSourceOfIncome(),additionalInfo.getNetWorthDate(),additionalInfo.getOccupation(),additionalInfo.getPolExpPerson(),additionalInfo.getTaxPayer());
    }
}

