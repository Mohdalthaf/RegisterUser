package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Entity.AdditionalInfo;
import com.example.RegisterLogin.Repo.AdditionalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdditionalInfoService {

    private final AdditionalInfoRepository additionalInfoRepository;

    @Autowired
    public AdditionalInfoService(AdditionalInfoRepository additionalInfoRepository) {
        this.additionalInfoRepository = additionalInfoRepository;
    }

    public void saveAdditionalInfo(AdditionalInfo additionalInfo) {
        additionalInfoRepository.save(additionalInfo);
    }

    public Optional<AdditionalInfo> getAdditionalInfoById(Long addId) {
        return additionalInfoRepository.findById(addId);
    }

    public void editAdditionalInfo(Long addId, AdditionalInfo editedInfo) {
        // Check if the record with the provided ID exists
        Optional<AdditionalInfo> existingInfo = additionalInfoRepository.findById(addId);

        if (existingInfo.isPresent()) {
            // Update the existing record with the edited information
            AdditionalInfo currentInfo = existingInfo.get();
            // You may choose to update only non-null fields or update all fields based on your requirements
            currentInfo.setAnnualIncome(editedInfo.getAnnualIncome());
            currentInfo.setCountryOfBirth(editedInfo.getCountryOfBirth());
            currentInfo.setNetWorth(editedInfo.getNetWorth());
            currentInfo.setSourceOfIncome(editedInfo.getSourceOfIncome());
            currentInfo.setNetWorthDate(editedInfo.getNetWorthDate());
            currentInfo.setOccupation(editedInfo.getOccupation());
            currentInfo.setPolExpPerson(editedInfo.getPolExpPerson());
            currentInfo.setTaxPayer(editedInfo.getTaxPayer());

            // Save the updated information
            additionalInfoRepository.save(currentInfo);
        } else {
            // Handle the case where the record with the provided ID does not exist
            // You may choose to throw an exception, log an error, or handle it as needed
            // For simplicity, we're not throwing an exception in this example
        }
    }

    // Implement additional business logic or methods as needed
}
