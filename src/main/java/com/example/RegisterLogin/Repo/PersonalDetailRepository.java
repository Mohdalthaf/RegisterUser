package com.example.RegisterLogin.Repo;
import com.example.RegisterLogin.Entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDetailRepository extends JpaRepository<PersonalDetails, Long> {
    // Custom queries if needed
}
