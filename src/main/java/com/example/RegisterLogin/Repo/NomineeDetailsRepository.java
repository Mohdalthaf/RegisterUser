package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.NomineeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomineeDetailsRepository extends JpaRepository<NomineeDetails, Long> {
    // Custom queries if needed
}
