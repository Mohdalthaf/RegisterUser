package com.example.RegisterLogin.Repo;


import com.example.RegisterLogin.Entity.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<FileUpload, Long> {
    // You can add custom query methods if needed
}

