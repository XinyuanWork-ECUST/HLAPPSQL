package com.xxx.demo.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "stucpc")
public class StuCPC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column
    int stuID;

    @Column
    boolean isCCYL;

    @Column(name="CCYL_join_Data")
    Date CCYLJoinDate;

    @Column(name="requisition_Submitted")
    boolean requisitionSubmitted;

    @Column(name="requisition_Submit_Date")
    Date requisitionSubmitDate;

    @Column(name="intermediate_Party_School")
    boolean intermediatePartySchool;

    @Column(name="intermediate_Party_School_Date")
    Date intermediatePartySchoolDate;

    @Column(name="intermediate_Party_School_Lead")
    int intermediatePartySchoolLead;

    @Column(name="intermediate_Party_School_Score")
    double intermediatePartySchoolScore;

    @Column(name="senior_Party_School")
    boolean seniorPartySchool;

    @Column(name="senior_Party_School_Requisition_Submit_Date")
    Date seniorPartySchoolRequisitionSubmitDate;

    @Column(name="senior_Party_School_Date")
    Date seniorPartySchoolDate;

    @Column(name="senior_Party_School_Score")
    double seniorPartySchoolScore;

    @Column(name="senior_Party_School_No")
    int seniorPartySchoolNo;

    @Column(name="have_Join")
    boolean haveJoin;

    @Column(name="join_Date")
    Date joinDate;

    @Column
    String condition;

    public StuCPC(){}
    public StuCPC(int stuID,boolean isCCYL,Date CCYLJoinDate,boolean requisitionSubmitted,Date requisitionSubmitDate,boolean intermediatePartySchool,Date intermediatePartySchoolDate,int intermediatePartySchoolLead,double intermediatePartySchoolScore,boolean seniorPartySchool,Date seniorPartySchoolRequisitionSubmitDate,Date seniorPartySchoolDate,double seniorPartySchoolScore,int seniorPartySchoolNo,boolean haveJoin,Date joinDate,String condition) {
        this.stuID =stuID ;
        this.isCCYL=isCCYL;
        this.CCYLJoinDate=CCYLJoinDate;
        this.requisitionSubmitted=requisitionSubmitted;
        this.requisitionSubmitDate=requisitionSubmitDate;
        this.intermediatePartySchool=intermediatePartySchool;
        this.intermediatePartySchoolDate=intermediatePartySchoolDate;
        this.intermediatePartySchoolLead=intermediatePartySchoolLead;
        this.intermediatePartySchoolScore=intermediatePartySchoolScore;
        this.seniorPartySchool=seniorPartySchool;
        this.seniorPartySchoolRequisitionSubmitDate=seniorPartySchoolRequisitionSubmitDate;
        this.seniorPartySchoolDate=seniorPartySchoolDate;
        this.seniorPartySchoolScore=seniorPartySchoolScore;
        this.seniorPartySchoolNo=seniorPartySchoolNo;
        this.haveJoin=haveJoin;
        this.joinDate=joinDate;
        this.condition=condition;
    }

    @Override
    public String toString() {
        return "StuCPC{" +
                "id=" + id +
                ", stuID='" + stuID + '\'' +
                ", isCCYL='" + isCCYL + '\'' +
                ", CCYLJoinDate='" + CCYLJoinDate + '\'' +
                ", requisitionSubmitted='"+ requisitionSubmitted +'\''+
                ", requisitionSubmitDate='"+ requisitionSubmitDate +'\''+
                ", intermediatePartySchool='"+ intermediatePartySchool +'\''+
                ", intermediatePartySchoolDate='"+ intermediatePartySchoolDate +'\''+
                ", intermediatePartySchoolLead='"+ intermediatePartySchoolLead +'\''+
                ", intermediatePartySchoolScore='"+ intermediatePartySchoolScore +'\''+
                ", seniorPartySchool='"+ seniorPartySchool +'\''+
                ", seniorPartySchoolRequisitionSubmitDate='"+ seniorPartySchoolRequisitionSubmitDate +'\''+
                ", seniorPartySchoolDate:Date='"+ seniorPartySchoolDate +'\''+
                ", seniorPartySchoolScore='"+ seniorPartySchoolScore +'\''+
                ", seniorPartySchoolNo='"+ seniorPartySchoolNo +'\''+
                ", haveJoin='"+ haveJoin +'\''+
                ", joinData='"+ joinDate +'\''+
                ", condition='"+ condition +'\''+
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuID() {return stuID;}

    public void setStuID(int stuID) {this.stuID=stuID;}

    public boolean getIsCCYL() {return isCCYL;}

    public void setIsCCYL(boolean isCCYL) {this.isCCYL=isCCYL;}

    public Date getCCYLJoinDate() {return CCYLJoinDate;}

    public void setCCYLJoinDate(Date CCYLJoinDate)  {this.CCYLJoinDate=CCYLJoinDate;}

    public boolean getRequisitionSubmitted() {return requisitionSubmitted;}

    public void setRequisitionSubmitted(boolean requisitionSubmitted) {this.requisitionSubmitted=requisitionSubmitted;}

    public Date getRequisitionSubmitDate() {return requisitionSubmitDate;}

    public void setRequisitionSubmitDate(Date requisitionSubmitDate) {this.requisitionSubmitDate=requisitionSubmitDate;}

    public boolean getIntermediatePartySchool() {return intermediatePartySchool;}

    public void setIntermediatePartySchool(boolean intermediatePartySchool) {this.intermediatePartySchool=intermediatePartySchool;}

    public Date getIntermediatePartySchoolDate() {return intermediatePartySchoolDate;}

    public void setIntermediatePartySchoolDate(Date intermediatePartySchoolDate) {this.intermediatePartySchoolDate=intermediatePartySchoolDate;}

    public int getIntermediatePartySchoolLead() {return intermediatePartySchoolLead;}

    public void setIntermediatePartySchoolLead(int intermediatePartySchoolLead)  {this.intermediatePartySchoolLead=intermediatePartySchoolLead;}

    public double getIntermediatePartySchoolScore()  {return intermediatePartySchoolScore;}

    public void setIntermediatePartySchoolScore(double intermediatePartySchoolScore)  {this.intermediatePartySchoolScore=intermediatePartySchoolScore;}

    public boolean getSeniorPartySchool() {return seniorPartySchool;}

    public void setSeniorPartySchool(boolean seniorPartySchool) {this.seniorPartySchool=seniorPartySchool;}

    public Date getSeniorPartySchoolRequisitionSubmitDate() {return seniorPartySchoolRequisitionSubmitDate;}

    public void setSeniorPartySchoolRequisitionSubmitDate(Date seniorPartySchoolRequisitionSubmitDate)  {this.seniorPartySchoolRequisitionSubmitDate=seniorPartySchoolRequisitionSubmitDate;}

    public double getSeniorPartySchoolScore() {return seniorPartySchoolScore;}

    public void setSeniorPartySchoolScore(double seniorPartySchoolScore)  {this.seniorPartySchoolScore=seniorPartySchoolScore;}

    public int getSeniorPartySchoolNo() {return seniorPartySchoolNo;}

    public void setSeniorPartySchoolNo(int seniorPartySchoolNo) {this.seniorPartySchoolNo=seniorPartySchoolNo;}

    public boolean getHaveJoin()  {return haveJoin;}

    public void setHaveJoin(boolean haveJoin) {this.haveJoin=haveJoin;}

    public Date getJoinDate() {return joinDate;}

    public void setJoinDate(Date joinDate)  {this.joinDate=joinDate;}

    public String getCondition() {return condition;}

    public void setCondition(String condition) {this.condition=condition;}

}


