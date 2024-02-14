package com.example.RegisterLogin.UserController;
import com.example.RegisterLogin.Entity.FileUpload;
import com.example.RegisterLogin.Service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/fileuploads")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping
    public List<FileUpload> getAllFileUploads() {
        return fileUploadService.getAllFileUploads();
    }

    @PostMapping("/file")
    public FileUpload uploadFiles(@RequestBody FileUpload fileUpload
    ) throws IOException {
      //  System.out.printf("Userid :********************** "+userId+" *******************");
        System.out.printf("Userid :********************** "+fileUpload.getAadharimg());
        //FileUpload fileUpload = new FileUpload();


        return fileUploadService.saveFileUpload(fileUpload);
    }

    // Other controller methods as needed
}