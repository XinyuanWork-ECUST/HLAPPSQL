package com.xxx.demo.Repository;

import com.xxx.demo.Entity.StuCPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface StuCPCRepository extends JpaRepository<StuCPC,Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into stucpc set stu_id=?1,is_ccyl=?2,ccyl_join_date=?3,requisition_submitted=?4,requisition_submit_date=?5,intermediate_party_school=?6,intermediate_party_school_date=?7,intermediate_party_school_lead=?8,intermediate_party_school_score=?9,senior_party_school=?10,senior_party_school_requisition_submit_date=?11,senior_party_school_date=?12,senior_party_school_score=?13,senior_party_school_no=?14,have_join=?15,join_date=?16,stucpc_condition=?17",nativeQuery = true)

    public void createStuCPC(int stuID,boolean isCCYL,Date CCYLJoinDate, boolean requisitionSubmitted,Date requisitionSubmitDate,boolean intermediatePartySchool,Date intermediatePartySchoolDate,int intermediatePartySchoolLead,double intermediatePartySchoolScore,boolean seniorPartySchool,Date seniorPartySchoolRequisitionSubmitDate,Date seniorPartySchoolDate,double seniorPartySchoolScore,int seniorPartySchoolNo,boolean haveJoin,Date joinDate,String condition);

    @Transactional
    @Modifying
    @Query(value = "update stucpc set stu_id=?2,is_ccyl=?3,ccyl_join_date=?4,requisition_submitted=?5,requisition_submit_date=?6,intermediate_party_school=?7,intermediate_party_school_date=?8,intermediate_party_school_lead=?9,intermediate_party_school_score=?10,senior_party_school=?11,senior_party_school_requisition_submit_date=?12,senior_party_school_date=?13,senior_party_school_score=?14,senior_party_school_no=?15,have_join=?16,join_date=?17,stucpc_condition=?18 where id=?1",nativeQuery = true)
    public void updateStuCPC(int id,int stuID,boolean isCCYL,Date CCYLJoinDate, boolean requisitionSubmitted,Date requisitionSubmitDate,boolean intermediatePartySchool,Date intermediatePartySchoolDate,int intermediatePartySchoolLead,double intermediatePartySchoolScore,boolean seniorPartySchool,Date seniorPartySchoolRequisitionSubmitDate,Date seniorPartySchoolDate,double seniorPartySchoolScore,int seniorPartySchoolNo,boolean haveJoin,Date joinDate,String condition);


//    @Transactional
//    @Modifying
//    @Query(value = "update award set name=?2,rank=?3,level=?4 where id=?1",nativeQuery = true)
//    public void updateStuCPC(int id,String name,String rank,String level);
//
//    @Query(value = "select * from award where name=?1",nativeQuery = true)
//    public StuCPC getStuCPCBystuID(String name);
//
//    @Query(value = "select * from award",nativeQuery = true)
//    public List<StuCPC> getStuCPCList();

}
