package ru.kafpin.SchoolKurs.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class ClassNum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClassNum")
    private Long idClassNum;
    private String className;
    private Teacher teacher;

    public ClassNum(Long idClassNum, String className, Teacher teacher) {
        this.idClassNum = idClassNum;
        this.className = className;
        this.teacher = teacher;
    }

    public Long getIdClassNum() {
        return idClassNum;
    }

    public void setIdClassNum(Long idClassNum) {
        this.idClassNum = idClassNum;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "ClassNum{" +
                "idClassNum=" + idClassNum +
                ", className='" + className + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
