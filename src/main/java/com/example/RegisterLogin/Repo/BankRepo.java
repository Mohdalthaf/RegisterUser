package com.example.RegisterLogin.Repo;


import com.example.RegisterLogin.Entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface BankRepo extends JpaRepository<Bank,Integer> {

    //   Optional<User> findOneByUsernameAndPassword(String userName, String password);
    Optional<Bank> findByUserid(String Userid);
}
