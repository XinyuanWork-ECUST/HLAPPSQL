package com.xxx.demo.Entity;

import javax.persistence.*;

@Entity(name="stucompetition")
public class StuCompetition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="stu_id")
    String stuID;

    @Column(name="stu_name")
    String stuName;

    @Column(name="competition_id")
    int competitionID;

    @Column(name = "competition_name")
    String competitionName;

    @Column
    String no;

    public StuCompetition(){}
    public StuCompetition(String stuID, String stuName, int competitionID, String competitionName, String no) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.competitionID = competitionID;
        this.competitionName = competitionName;
        this.no = no;
    }

    @Override
    public String toString() {
        return "StuCompetition{" +
                "id=" + id +
                ", stuID='" + stuID + '\'' +
                ", stuName='" + stuName + '\'' +
                ", competitionID=" + competitionID +
                ", competitionName='" + competitionName + '\'' +
                ", no='" + no + '\'' +
                '}';
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

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getCompetitionID() {
        return competitionID;
    }

    public void setCompetitionID(int competitionID) {
        this.competitionID = competitionID;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
