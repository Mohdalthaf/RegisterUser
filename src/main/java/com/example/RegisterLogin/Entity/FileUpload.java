package com.example.RegisterLogin.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Fileuploads_tbl")
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fileid")
    private Long fileid;

    @Column(name = "userid")
    private Long userid;

    @Lob
    @Column(name = "aadharimg", columnDefinition = "NVARCHAR(MAX)")
    private String aadharimg;

    @Lob
    @Column(name = "panimg", columnDefinition = "NVARCHAR(MAX)")
    private String panimg;

    @Lob
    @Column(name = "bankimg", columnDefinition = "NVARCHAR(MAX)")
    private String bankimg;


    // Getter and Setter methods

    public Long getFileid() {
        return fileid;
    }

    public void setFileid(Long fileid) {
        this.fileid = fileid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getAadharimg() {
        return aadharimg;
    }

    public void setAadharimg(String aadharimg) {
        this.aadharimg = aadharimg;
    }

    public String getPanimg() {
        return panimg;
    }

    public void setPanimg(String panimg) {
        this.panimg = panimg;
    }

    public String getBankimg() {
        return bankimg;
    }

    public void setBankimg(String bankimg) {
        this.bankimg = bankimg;
    }

    @Override
    public String toString() {
        return "FileUpload{" +
                "fileid=" + fileid +
                ", userid=" + userid +
                ", aadharimg='" + aadharimg + '\'' +
                ", panimg='" + panimg + '\'' +
                ", bankimg='" + bankimg + '\'' +
                '}';
    }
}
