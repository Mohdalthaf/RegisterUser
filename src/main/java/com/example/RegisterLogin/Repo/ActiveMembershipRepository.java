package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.ActiveMembership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiveMembershipRepository extends JpaRepository<ActiveMembership, Long> {
    // Custom queries if needed
}

