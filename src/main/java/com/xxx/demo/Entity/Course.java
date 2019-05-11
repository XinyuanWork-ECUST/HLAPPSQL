package com.xxx.demo.Entity;

import javax.persistence.*;

@Entity(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;


    @Column
    String name;  // 课程名称

    @Column
    Float credit;  // 课程学分

    @Column
    String school;  // 开设学院

    @Column
    String type;  // 课程类型,如"必修课"、"专业选修课"、"公共选修课"等

    public Course(){}
    public Course(String name, Float credit, String school, String type) {
        this.name = name;
        this.credit = credit;
        this.school = school;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", school='" + school + '\'' +
                ", type='" + type + '\'' +
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
