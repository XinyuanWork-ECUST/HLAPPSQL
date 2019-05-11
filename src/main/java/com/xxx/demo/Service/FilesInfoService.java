package com.xxx.demo.Service;

import com.xxx.demo.Entity.FilesInfo;
import com.xxx.demo.Repository.FilesInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("filesinfoService")
public class FilesInfoService {
    @Autowired
    FilesInfoRepository filesInfoRepository;

    public boolean createFilesInfo(String stuID, String stuName,boolean seniorHighSchoolFileExist,boolean CCYLApplicationFormExist,boolean CCYLCertificateExist){
        try{
            filesInfoRepository.createFilesInfo(stuID,stuName,seniorHighSchoolFileExist,CCYLApplicationFormExist,CCYLCertificateExist);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public FilesInfo getFilesInfoByStuID(String stuID){
        FilesInfo filesinfo=filesInfoRepository.getFilesInfoByStuID(stuID);
        return filesinfo;
    }

    public List<FilesInfo> getFilesInfoList(){
        List<FilesInfo> list=filesInfoRepository.getFilesInfoList();
        return list;
    }

    public void updateFilesInfo(int id,String stuID, String stuName,boolean seniorHighSchoolFileExist,boolean CCYLApplicationFormExist,boolean CCYLCertificateExist){
        filesInfoRepository.updateFilesInfo(id,stuID,stuName,seniorHighSchoolFileExist,CCYLApplicationFormExist,CCYLCertificateExist);
    }

    public void deleteFilesInfo(int id){
        filesInfoRepository.deleteById(id);
    }

    public void deleteSomeFilesInfo(int []id){
        for(int i=0;i<id.length;i++){
            filesInfoRepository.deleteById(id[i]);
        }
    }
}
