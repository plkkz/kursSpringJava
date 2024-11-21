package ru.kafpin.SchoolKurs.entities;

import jakarta.persistence.*;

import javax.security.auth.Subject;
import java.util.Date;
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTeacher")
    private Long idTeacher;
    private String surnameTeacher;
    private String nameTeacher;
    private String patronymTeacher;
    private SubjectTeach subjectTeach;

    public Teacher(Long idTeacher, String surnameTeacher, String nameTeacher, String patronymTeacher, SubjectTeach subjectTeach) {
        this.idTeacher = idTeacher;
        this.surnameTeacher = surnameTeacher;
        this.nameTeacher = nameTeacher;
        this.patronymTeacher = patronymTeacher;
        this.subjectTeach = subjectTeach;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSurnameTeacher() {
        return surnameTeacher;
    }

    public void setSurnameTeacher(String surnameTeacher) {
        this.surnameTeacher = surnameTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getPatronymTeacher() {
        return patronymTeacher;
    }

    public void setPatronymTeacher(String patronymTeacher) {
        this.patronymTeacher = patronymTeacher;
    }

    public SubjectTeach getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(SubjectTeach subjectTeach) {
        this.subjectTeach = subjectTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                ", surnameTeacher='" + surnameTeacher + '\'' +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", patronymTeacher='" + patronymTeacher + '\'' +
                ", subjectTeach=" + subjectTeach +
                '}';
    }
}
