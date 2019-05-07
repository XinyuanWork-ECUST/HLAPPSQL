package com.xxx.demo.Entity;

import javax.persistence.*;

@Entity(name = "stuaward")
public class StuAward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="stu_id")
    String stuID;

    @Column(name="stu_name")
    String stuName;

    @Column(name="award_id")
    int awardID;

    @Column(name = "award_name")
    String awardName;

    @Column
    String no;

    public StuAward(){}
    public StuAward(String stuID, String stuName, int awardID, String awardName, String no) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.awardID = awardID;
        this.awardName = awardName;
        this.no = no;
    }

    @Override
    public String toString() {
        return "StuAward{" +
                "id=" + id +
                ", stuID='" + stuID + '\'' +
                ", stuName='" + stuName + '\'' +
                ", awardID=" + awardID +
                ", awardName='" + awardName + '\'' +
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

    public int getAwardID() {
        return awardID;
    }

    public void setAwardID(int awardID) {
        this.awardID = awardID;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
