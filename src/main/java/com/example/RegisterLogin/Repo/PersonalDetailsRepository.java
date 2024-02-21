package com.example.RegisterLogin.Repo;


import com.example.RegisterLogin.Entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Long> {
}

