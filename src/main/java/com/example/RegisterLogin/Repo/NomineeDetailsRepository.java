//package com.example.RegisterLogin.Repo;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//// NomineeDetailsRepository.java
//public interface NomineeDetailsRepository extends JpaRepository<NomineeDetails, Long> {
//}
//


package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.NomineeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// NomineeDetailsRepository.java
public interface NomineeDetailsRepository extends JpaRepository<NomineeDetails, Long> {

    // Add additional custom queries or methods if needed



   List<NomineeDetails> findByNomineeName(String nomineename);

    // You can define more custom queries based on your requirements
}
