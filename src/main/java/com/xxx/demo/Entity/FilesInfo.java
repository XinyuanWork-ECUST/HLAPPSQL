package com.xxx.demo.Entity;

import javax.persistence.*;

@Entity(name ="filesinfo")
public class FilesInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="stu_id")
    String stuID;

    @Column(name="stu_name")
    String stuName;

    @Column(name="senior_high_school_file_exist")
    boolean seniorHighSchoolFileExist;

    @Column(name="ccyl_application_form_exist")
    boolean CCYLApplicationFormExist;

    @Column(name="ccyl_certificate_exist")
    boolean CCYLCertificateExist;

    public FilesInfo(){}
    public FilesInfo(String stuID,String stuName,boolean seniorHighSchoolFileExist,boolean CCYLApplicationFormExist,boolean CCYLCertificateExist){
         this.stuID=stuID;
         this.stuName=stuName;
         this.seniorHighSchoolFileExist=seniorHighSchoolFileExist;
         this.CCYLApplicationFormExist=CCYLApplicationFormExist;
         this.CCYLCertificateExist=CCYLCertificateExist;
    }

    @Override
    public String toString() {
        return "FilesInfo{" +
                "id=" + id +
                ", stuID='" + stuID + '\'' +
                ", stuName='"+ stuName +'\''+
                ", seniorHighSchoolFileExist='" + seniorHighSchoolFileExist + '\'' +
                ", CCYLApplicationFormExist='" + CCYLApplicationFormExist + '\'' +
                ", CCYLCertificateExist='"+ CCYLCertificateExist +'\''+
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuID()  {return stuID;}

    public void setStuID(String stuID)  {this.stuID=stuID;}

    public String getStuName() {return stuName;}

    public void setStuName(String stuName)  {this.stuName=stuName;}

    public boolean getSeniorHighSchoolFileExist()  {return seniorHighSchoolFileExist;}

    public void setSeniorHighSchoolFileExist(boolean seniorHighSchoolFileExist) {this.seniorHighSchoolFileExist=seniorHighSchoolFileExist;}

    public boolean getCCYLApplicationFormExist() {return CCYLApplicationFormExist;}

    public void setCCYLApplicationFormExist(boolean CCYLApplicationFormExist) {this.CCYLApplicationFormExist=CCYLApplicationFormExist;}

    public boolean getCCYLCertificateExist() {return CCYLCertificateExist;}

    public  void setCCYLCertificateExist(boolean CCYLCertificateExist)  {this.CCYLCertificateExist=CCYLCertificateExist;}
}
