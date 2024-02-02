package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.BankDTO;
import com.example.RegisterLogin.Entity.Bank;

import java.util.Optional;

public interface BankService {
    String addBank(BankDTO bankDTO);

    void updateBankDetails(String userid, BankDTO updatedBankDTO);

    Optional<Bank> findByUserid(String userid);
}
