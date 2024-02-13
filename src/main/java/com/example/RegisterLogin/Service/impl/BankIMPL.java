package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Dto.BankDTO;
import com.example.RegisterLogin.Entity.Bank;
import com.example.RegisterLogin.Repo.BankRepo;
import com.example.RegisterLogin.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankIMPL implements BankService {
    @Autowired
    private BankRepo bankRepo;

    @Override
    public String addBank(BankDTO bankDTO) {
        System.out.println("userid:"+bankDTO);
        Bank bank = new Bank(
//"2",
                   String.valueOf(bankDTO.getUserid()),
                    bankDTO.getAcctype(),
                    bankDTO.getAccno(),
                    bankDTO.getIfsccode()
            );

        bankRepo.save(bank);
        return String.valueOf(bank.getUserid());  // Convert Integer to String before returning
    }


    public Optional<Bank> findUserByUserId(String userid) {
        return bankRepo.findByUserid(userid);
    }

    @Override
    public void updateBankDetails(String userid, BankDTO updatedBankDTO) {
        Optional<Bank> existingUser = bankRepo.findByUserid(userid);

        if (existingUser.isPresent()) {
            Bank userToUpdate = existingUser.get();

            // Update the user details with the new values from updatedBankDTO
            userToUpdate.setAcctype(updatedBankDTO.getAcctype());
            userToUpdate.setAccno(updatedBankDTO.getAccno());
            userToUpdate.setIfsccode(updatedBankDTO.getIfsccode());

            // Save the updated user details
            bankRepo.save(userToUpdate);
        } else {
            // Handle the case where the user with the specified userid is not found
            // You might want to throw an exception or handle it based on your requirements
        }
    }

    @Override
    public Optional<Bank> findByUserid(String userid) {
        return Optional.empty();
    }

}
