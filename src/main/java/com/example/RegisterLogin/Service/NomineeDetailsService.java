package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.NomineeDetailsDTO;
import com.example.RegisterLogin.Dto.NomineeDetailsResponseDTO;
import com.example.RegisterLogin.Entity.NomineeDetails;
import com.example.RegisterLogin.Repo.NomineeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// NomineeDetailsService.java
@Service
public class NomineeDetailsService {

    @Autowired
    private NomineeDetailsRepository nomineeDetailsRepository;

    public NomineeDetailsResponseDTO submitNomineeDetails(NomineeDetailsDTO nomineeDetailsDTO) {
        try {
            NomineeDetails nomineeDetails = convertDtoToEntity(nomineeDetailsDTO);
            System.out.println("NOMINEE **************** "+nomineeDetails.toString());
            nomineeDetailsRepository.save(nomineeDetails);
            return new NomineeDetailsResponseDTO("Nominee details submitted successfully!");
        } catch (Exception e) {
            System.out.println("Exception : "+e);
            e.printStackTrace();
            return new NomineeDetailsResponseDTO("Error submitting nominee details");
        }
    }

    private NomineeDetails convertDtoToEntity(NomineeDetailsDTO dto) {
        System.out.println("###########"+dto);
        NomineeDetails entity = new NomineeDetails();
        entity.setNomineename(dto.getNomineename());
        entity.setDateOfBirth(dto.getDateofbirth());
        entity.setRelationship(dto.getRelationship());
        entity.setNoNominee(dto.isNoNominee());
        entity.setUserId(dto.getUserid());
        System.out.println("###########"+entity.isNoNominee());
        return entity;
    }
}

