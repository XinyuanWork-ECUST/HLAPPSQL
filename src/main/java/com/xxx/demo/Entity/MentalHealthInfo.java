package com.xxx.demo.Entity;

import javax.persistence.*;

@Entity(name ="mentalhealthinfo")
public class MentalHealthInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="stu_id")
    String stuID;

    @Column(name="stu_name")
    String stuName;

    @Column(name="security_threat_type")
    String securityThreatType;

    @Column(name="unusual_change_reference")
    String unusualChangeReference;

    @Column(name="concern_level")
    String concernLevel;

    @Column(name="current_state")
    String currentState;

    @Column(name="school_action")
    String schoolAction;

    @Column(name="tutor_id")
    String tutorID;

    @Column(name="tutor_phone")
    String tutorPhone;

    @Column(name="talk_condition")
    String talkCondition;

    public MentalHealthInfo(){}
    public MentalHealthInfo(String stuID, String stuName, String securityThreatType, String unusualChangeReference, String concernLevel, String currentState, String schoolAction, String tutorID, String tutorPhone, String talkCondition) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.securityThreatType = securityThreatType;
        this.unusualChangeReference = unusualChangeReference;
        this.concernLevel = concernLevel;
        this.currentState = currentState;
        this.schoolAction = schoolAction;
        this.tutorID = tutorID;
        this.tutorPhone = tutorPhone;
        this.talkCondition = talkCondition;
    }

    @Override
    public String toString() {
        return "MentalHealthInfo{" +
                "id=" + id +
                ", stuID='" + stuID + '\'' +
                ", stuName='" + stuName + '\'' +
                ", securityThreatType='" + securityThreatType + '\'' +
                ", unusualChangeReference='" + unusualChangeReference + '\'' +
                ", concernLevel='" + concernLevel + '\'' +
                ", currentState='" + currentState + '\'' +
                ", schoolAction='" + schoolAction + '\'' +
                ", tutorID='" + tutorID + '\'' +
                ", tutorPhone='" + tutorPhone + '\'' +
                ", talkCondition='" + talkCondition + '\'' +
                '}';
    }

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getStuID() {        return stuID;    }

    public void setStuID(String stuID) {        this.stuID = stuID;    }

    public String getStuName() {        return stuName;    }

    public void setStuName(String stuName) {        this.stuName = stuName;    }

    public String getSecurityThreatType() {        return securityThreatType;    }

    public void setSecurityThreatType(String securityThreatType) {        this.securityThreatType = securityThreatType;    }

    public String getUnusualChangeReference() {        return unusualChangeReference;    }

    public void setUnusualChangeReference(String unusualChangeReference) {        this.unusualChangeReference = unusualChangeReference;    }

    public String getConcernLevel() {        return concernLevel;    }

    public void setConcernLevel(String concernLevel) {        this.concernLevel = concernLevel;    }

    public String getCurrentState() {        return currentState;    }

    public void setCurrentState(String currentState) {        this.currentState = currentState;    }

    public String getSchoolAction() {        return schoolAction;    }

    public void setSchoolAction(String schoolAction) {        this.schoolAction = schoolAction;    }

    public String getTutorID() {        return tutorID;    }

    public void setTutorID(String tutorID) {        this.tutorID = tutorID;    }

    public String getTutorPhone() {        return tutorPhone;    }

    public void setTutorPhone(String tutorPhone) {        this.tutorPhone = tutorPhone;    }

    public String getTalkCondition() {        return talkCondition;    }

    public void setTalkCondition(String talkCondition) {        this.talkCondition = talkCondition;    }
}
