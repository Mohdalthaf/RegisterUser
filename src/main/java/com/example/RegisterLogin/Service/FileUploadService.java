package com.example.RegisterLogin.Service;


import com.example.RegisterLogin.Entity.FileUpload;
import com.example.RegisterLogin.Repo.FileUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FileUploadService {

    @Autowired
    private FileUploadRepository fileUploadRepository;

    public List<FileUpload> getAllFileUploads() {
        return fileUploadRepository.findAll();
    }

    public FileUpload saveFileUpload(FileUpload fileUpload) {
        return fileUploadRepository.save(fileUpload);
    }

    // Other service methods as needed
}
