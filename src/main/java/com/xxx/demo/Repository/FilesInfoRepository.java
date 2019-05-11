package com.xxx.demo.Repository;

import com.xxx.demo.Entity.FilesInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface FilesInfoRepository extends JpaRepository<FilesInfo,Integer>{
    @Transactional
    @Modifying
    @Query(value = "insert into filesinfo set stu_id=?1,stu_name=?2,senior_high_school_file_exist=?3,ccyl_application_form_exist=?4,ccyl_certificate_exist=?5",nativeQuery = true)
    public void createFilesInfo(String stuID, String stuName,boolean seniorHighSchoolFileExist,boolean CCYLApplicationFormExist,boolean CCYLCertificateExist);

    @Transactional
    @Modifying
    @Query(value = "update filesinfo set stu_id=?2,stu_name=?3,senior_high_school_file_exist=?4,ccyl_application_form_exist=?5,ccyl_certificate_exist=?6 where id=?1",nativeQuery = true)
    public void updateFilesInfo(int id,String stuID, String stuName,boolean seniorHighSchoolFileExist,boolean CCYLApplicationFormExist,boolean CCYLCertificateExist);

    @Query(value = "select * from filesinfo where stu_id=?1",nativeQuery = true)
    public FilesInfo getFilesInfoByStuID(String stuID);

    @Query(value = "select * from filesinfo",nativeQuery = true)
    public List<FilesInfo> getFilesInfoList();
}
