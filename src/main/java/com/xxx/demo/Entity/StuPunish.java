package com.xxx.demo.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "stupunish")
public class StuPunish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name = "stu_id")
    String stuID;

    @Column(name = "stu_name")
    String stuName;

    @Column(name = "punish_id")
    int punishID;

    @Column
    String description;

    @Column
    Date date;

    @Column
    String note;

    public StuPunish(){}
    public StuPunish(String stuID, String stuName, int punishID, String description, Date date, String note) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.punishID = punishID;
        this.description = description;
        this.date = date;
        this.note = note;
    }

    @Override
    public String toString() {
        return "StuPunish{" +
                "id=" + id +
                ", stuID='" + stuID + '\'' +
                ", stuName='" + stuName + '\'' +
                ", punishID=" + punishID +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", note='" + note + '\'' +
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

    public int getPunishID() {
        return punishID;
    }

    public void setPunishID(int punishID) {
        this.punishID = punishID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
