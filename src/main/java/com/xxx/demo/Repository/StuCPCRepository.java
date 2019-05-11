package com.xxx.demo.Repository;

import com.xxx.demo.Entity.StuCPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Date;

@Repository
public interface StuCPCRepository extends JpaRepository<StuCPC,Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into stucpc set stuID=?1,isCCYL=?2,CCYLJoinDate=?3,requisitionSubmitted=?4,requisitionSubmitDate=?5,intermediatePartySchool=?6,intermediatePartySchoolDate=?7,intermediatePartySchoolLead=?8,intermediatePartySchoolScore=?9,seniorPartySchool=?10,seniorPartySchoolRequisitionSubmitDate=?11,seniorPartySchoolDate=?12,seniorPartySchoolScore=?13,seniorPartySchoolNo=?14,haveJoin=?15,joinDate=?16,condition=?17",nativeQuery = true)
    public void createStuCPC(int stuID,boolean isCCYL,Date CCYLJoinDate, boolean requisitionSubmitted,Date requisitionSubmitDate,boolean intermediatePartySchool,Date intermediatePartySchoolDate,int intermediatePartySchoolLead,double intermediatePartySchoolScore,boolean seniorPartySchool,Date seniorPartySchoolRequisitionSubmitDate,Date seniorPartySchoolDate,double seniorPartySchoolScore,int seniorPartySchoolNo,boolean haveJoin,Date joinDate,String condition);

    @Transactional
    @Modifying
    @Query(value = "update stucpc set stuID=?2,isCCYL=?3,CCYLJoinDate=?4,requisitionSubmitted=?5,requisitionSubmitDate=?6,intermediatePartySchool=?7,intermediatePartySchoolDate=?8,intermediatePartySchoolLead=?9,intermediatePartySchoolScore=?10,seniorPartySchool=?11,seniorPartySchoolRequisitionSubmitDate=?12,seniorPartySchoolDate=?13,seniorPartySchoolScore=?14,seniorPartySchoolNo=?15,haveJoin=?16,joinDate=?17,condition=?18 where id=?1",nativeQuery = true)
    public void updateStuCPC(int id,int stuID,boolean isCCYL,Date CCYLJoinDate, boolean requisitionSubmitted,Date requisitionSubmitDate,boolean intermediatePartySchool,Date intermediatePartySchoolDate,int intermediatePartySchoolLead,double intermediatePartySchoolScore,boolean seniorPartySchool,Date seniorPartySchoolRequisitionSubmitDate,Date seniorPartySchoolDate,double seniorPartySchoolScore,int seniorPartySchoolNo,boolean haveJoin,Date joinDate,String condition);

    @Query(value = "select * from stucpc where StuID=?1",nativeQuery = true)
    public StuCPC getStuCPCByStuID(int StuID);

    @Query(value = "select * from stucpc",nativeQuery = true)
    public List<StuCPC> getStuCPCList();
}
