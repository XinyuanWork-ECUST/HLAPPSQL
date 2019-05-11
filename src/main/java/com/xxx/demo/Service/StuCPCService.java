package com.xxx.demo.Service;

import com.xxx.demo.Repository.StuCPCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("stucpcService")
public class StuCPCService {
    @Autowired
    StuCPCRepository stucpcRepository;

    public boolean createStuCPC(String stuID, boolean isCCYL, Date CCYLJoinDate, boolean requisitionSubmitted, Date requisitionSubmitDate, boolean intermediatePartySchool, Date intermediatePartySchoolDate, String intermediatePartySchoolLead, double intermediatePartySchoolScore, boolean seniorPartySchool, Date seniorPartySchoolRequisitionSubmitDate, Date seniorPartySchoolDate, double seniorPartySchoolScore, int seniorPartySchoolNo, boolean haveJoin, Date joinDate, String condition){
        try{
            stucpcRepository.createStuCPC(stuID,isCCYL,CCYLJoinDate,requisitionSubmitted,requisitionSubmitDate,intermediatePartySchool,intermediatePartySchoolDate,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,seniorPartySchoolRequisitionSubmitDate,seniorPartySchoolDate,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,joinDate,condition);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
