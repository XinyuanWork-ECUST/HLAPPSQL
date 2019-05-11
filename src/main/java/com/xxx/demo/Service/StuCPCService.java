package com.xxx.demo.Service;

import com.xxx.demo.Entity.StuCPC;
import com.xxx.demo.Repository.StuCPCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

@Service("stucpcService")
public class StuCPCService {
    @Autowired
    StuCPCRepository stucpcRepository;

    public boolean createStuCPC(int stuID,boolean isCCYL,Date CCYLJoinDate,boolean requisitionSubmitted,Date requisitionSubmitDate,boolean intermediatePartySchool,Date intermediatePartySchoolDate,int intermediatePartySchoolLead,double intermediatePartySchoolScore,boolean seniorPartySchool,Date seniorPartySchoolRequisitionSubmitDate,Date seniorPartySchoolDate,double seniorPartySchoolScore,int seniorPartySchoolNo,boolean haveJoin,Date joinDate,String condition){
        try{
            stucpcRepository.createStuCPC(stuID,isCCYL,CCYLJoinDate,requisitionSubmitted,requisitionSubmitDate,intermediatePartySchool,intermediatePartySchoolDate,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,seniorPartySchoolRequisitionSubmitDate,seniorPartySchoolDate,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,joinDate,condition);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public StuCPC getStuCPCByStuID(int StuID){
        StuCPC stucpc=stucpcRepository.getStuCPCByStuID(StuID);
        return stucpc;
    }

    public List<StuCPC> getStuCPCList(){
        List<StuCPC> list=stucpcRepository.getStuCPCList();
        return list;
    }

    public void updateStuCPC(int id,int stuID,boolean isCCYL,Date CCYLJoinDate, boolean requisitionSubmitted,Date requisitionSubmitDate,boolean intermediatePartySchool,Date intermediatePartySchoolDate,int intermediatePartySchoolLead,double intermediatePartySchoolScore,boolean seniorPartySchool,Date seniorPartySchoolRequisitionSubmitDate,Date seniorPartySchoolDate,double seniorPartySchoolScore,int seniorPartySchoolNo,boolean haveJoin,Date joinDate,String condition){
        stucpcRepository.updateStuCPC(id,stuID,isCCYL,CCYLJoinDate,requisitionSubmitted,requisitionSubmitDate,intermediatePartySchool,intermediatePartySchoolDate,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,seniorPartySchoolRequisitionSubmitDate,seniorPartySchoolDate,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,joinDate,condition);

    }

    public void deleteStuCPC(int id){
        stucpcRepository.deleteById(id);
    }

    public void deleteSomeStuCPC(int []id){
        for(int i=0;i<id.length;i++){
            stucpcRepository.deleteById(id[i]);
        }
    }
}
