package com.xxx.demo.Entity;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.util.Date;

@Entity(name = "stucpc")
public class StuCPC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name = "stu_id")
    String stuID;

    @Column(name ="is_ccyl")
    boolean isCCYL;

    @Column(name = "ccyl_join_date")
    Date CCYLJoinDate;

    @Column(name = "requisition_submitted")
    boolean requisitionSubmitted;

    @Column(name = "requisition_submit_date")
    Date requisitionSubmitDate;

    @Column(name = "intermediate_party_school")
    boolean intermediatePartySchool;

    @Column(name = "intermediate_partyschool_date")
    Date intermediatePartySchoolDate;

    @Column(name = "intermediate_party_school_lead")
    String intermediatePartySchoolLead;

    @Column(name = "intermediate_party_school_score")
    double intermediatePartySchoolScore;

    @Column(name = "senior_party_school")
    boolean seniorPartySchool;

    @Column(name = "senior_party_school_requisition_submit_date")
    Date seniorPartySchoolRequisitionSubmitDate;

    @Column(name = "senior_party_school_date")
    Date seniorPartySchoolDate;

    @Column(name = "senior_party_school_score")
    double seniorPartySchoolScore;

    @Column(name = "senior_party_school_no")
    int seniorPartySchoolNo;

    @Column(name = "have_join")
    boolean haveJoin;

    @Column(name = "join_date")
    Date joinDate;

    @Column(name = "stucpc_condition")
    String condition;

    public StuCPC(){}

    public StuCPC(String stuID, boolean isCCYL, Date CCYLJoinDate, boolean requisitionSubmitted, Date requisitionSubmitDate, boolean intermediatePartySchool, Date intermediatePartySchoolDate, String intermediatePartySchoolLead, double intermediatePartySchoolScore, boolean seniorPartySchool, Date seniorPartySchoolRequisitionSubmitDate, Date seniorPartySchoolDate, double seniorPartySchoolScore, int seniorPartySchoolNo, boolean haveJoin, Date joinDate, String condition) {
        this.stuID = stuID;
        this.isCCYL = isCCYL;
        this.CCYLJoinDate = CCYLJoinDate;
        this.requisitionSubmitted = requisitionSubmitted;
        this.requisitionSubmitDate = requisitionSubmitDate;
        this.intermediatePartySchool = intermediatePartySchool;
        this.intermediatePartySchoolDate = intermediatePartySchoolDate;
        this.intermediatePartySchoolLead = intermediatePartySchoolLead;
        this.intermediatePartySchoolScore = intermediatePartySchoolScore;
        this.seniorPartySchool = seniorPartySchool;
        this.seniorPartySchoolRequisitionSubmitDate = seniorPartySchoolRequisitionSubmitDate;
        this.seniorPartySchoolDate = seniorPartySchoolDate;
        this.seniorPartySchoolScore = seniorPartySchoolScore;
        this.seniorPartySchoolNo = seniorPartySchoolNo;
        this.haveJoin = haveJoin;
        this.joinDate = joinDate;
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public boolean isCCYL() {
        return isCCYL;
    }

    public void setCCYL(boolean CCYL) {
        isCCYL = CCYL;
    }

    public Date getCCYLJoinDate() {
        return CCYLJoinDate;
    }

    public void setCCYLJoinDate(Date CCYLJoinDate) {
        this.CCYLJoinDate = CCYLJoinDate;
    }

    public boolean isRequisitionSubmitted() {
        return requisitionSubmitted;
    }

    public void setRequisitionSubmitted(boolean requisitionSubmitted) {
        this.requisitionSubmitted = requisitionSubmitted;
    }

    public Date getRequisitionSubmitDate() {
        return requisitionSubmitDate;
    }

    public void setRequisitionSubmitDate(Date requisitionSubmitDate) {
        this.requisitionSubmitDate = requisitionSubmitDate;
    }

    public boolean isIntermediatePartySchool() {
        return intermediatePartySchool;
    }

    public void setIntermediatePartySchool(boolean intermediatePartySchool) {
        this.intermediatePartySchool = intermediatePartySchool;
    }

    public Date getIntermediatePartySchoolDate() {
        return intermediatePartySchoolDate;
    }

    public void setIntermediatePartySchoolDate(Date intermediatePartySchoolDate) {
        this.intermediatePartySchoolDate = intermediatePartySchoolDate;
    }

    public String getIntermediatePartySchoolLead() {
        return intermediatePartySchoolLead;
    }

    public void setIntermediatePartySchoolLead(String intermediatePartySchoolLead) {
        this.intermediatePartySchoolLead = intermediatePartySchoolLead;
    }

    public double getIntermediatePartySchoolScore() {
        return intermediatePartySchoolScore;
    }

    public void setIntermediatePartySchoolScore(double intermediatePartySchoolScore) {
        this.intermediatePartySchoolScore = intermediatePartySchoolScore;
    }

    public boolean isSeniorPartySchool() {
        return seniorPartySchool;
    }

    public void setSeniorPartySchool(boolean seniorPartySchool) {
        this.seniorPartySchool = seniorPartySchool;
    }

    public Date getSeniorPartySchoolRequisitionSubmitDate() {
        return seniorPartySchoolRequisitionSubmitDate;
    }

    public void setSeniorPartySchoolRequisitionSubmitDate(Date seniorPartySchoolRequisitionSubmitDate) {
        this.seniorPartySchoolRequisitionSubmitDate = seniorPartySchoolRequisitionSubmitDate;
    }

    public Date getSeniorPartySchoolDate() {
        return seniorPartySchoolDate;
    }

    public void setSeniorPartySchoolDate(Date seniorPartySchoolDate) {
        this.seniorPartySchoolDate = seniorPartySchoolDate;
    }

    public double getSeniorPartySchoolScore() {
        return seniorPartySchoolScore;
    }

    public void setSeniorPartySchoolScore(double seniorPartySchoolScore) {
        this.seniorPartySchoolScore = seniorPartySchoolScore;
    }

    public int getSeniorPartySchoolNo() {
        return seniorPartySchoolNo;
    }

    public void setSeniorPartySchoolNo(int seniorPartySchoolNo) {
        this.seniorPartySchoolNo = seniorPartySchoolNo;
    }

    public boolean isHaveJoin() {
        return haveJoin;
    }

    public void setHaveJoin(boolean haveJoin) {
        this.haveJoin = haveJoin;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
