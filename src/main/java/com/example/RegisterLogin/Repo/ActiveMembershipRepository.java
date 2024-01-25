package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Dto.ProfileDTO;
import com.example.RegisterLogin.Entity.ActiveMembership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiveMembershipRepository extends JpaRepository<ActiveMembership, Long> {
    ActiveMembership findByNomineeDetails(ProfileDTO nomineeDetails);
    // Custom queries if needed
}

