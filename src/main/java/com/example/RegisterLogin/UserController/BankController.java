package com.example.RegisterLogin.UserController;


import com.example.RegisterLogin.Dto.BankDTO;
import com.example.RegisterLogin.Entity.Bank;
import com.example.RegisterLogin.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/v1/bank")

public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody BankDTO bankDTO) {
        String id = bankService.addBank(bankDTO);
        return id;
    }

    @GetMapping("/findUser/{userid}")
    public ResponseEntity<?> findUserByUserId(@PathVariable String userid) {
        Optional<Bank> user = bankService.findByUserid(userid);

        if (user.isPresent()) {
            // User found
            return ResponseEntity.ok(user.get());
        } else {
            // User not found
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/updateUser/{userid}")
    public ResponseEntity<?> updateBankDetails(@PathVariable String userid, @RequestBody BankDTO updatedBankDTO) {
        try {
            bankService.updateBankDetails(userid, updatedBankDTO);
            return ResponseEntity.ok("User details updated successfully");
        } catch (Exception e) {
            // Handle exceptions or errors, such as user not found, validation errors, etc.
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating user details");
        }
    }



}
