package com.xxx.demo.Entity;

import javax.persistence.*;

@Entity(name = "courseclass")
public class CourseClass {  // 课程班级表

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="name")
    String name;  // 课程名称

    @Column(name="credit")
    Float credit;  // 课程学分

    @Column(name="teacherID")
    String teacherID;  // 任课教师工号

    @Column(name="classID")
    String classID;  // 班级编号

    public CourseClass(){}
    public CourseClass(String name, Float credit, String teacherID, String classID) {
        this.name = name;
        this.credit = credit;
        this.teacherID = teacherID;
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", teacherID='" + teacherID + '\'' +
                ", classID='" + classID + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
}
