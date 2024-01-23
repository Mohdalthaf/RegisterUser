package com.example.RegisterLogin.Repo;



import com.example.RegisterLogin.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // You can add custom queries if needed
}
