package ru.kafpin.SchoolKurs.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGrade")
    private Long idGrade;
    private Student student;
    private SubjectTeach subjectTeach;
    private int grade;
    private Date dateGrade;

    public Grade(Long idGrade, Student student, SubjectTeach subjectTeach, int grade, Date dateGrade) {
        this.idGrade = idGrade;
        this.student = student;
        this.subjectTeach = subjectTeach;
        this.grade = grade;
        this.dateGrade = dateGrade;
    }

    public Long getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(Long idGrade) {
        this.idGrade = idGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SubjectTeach getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(SubjectTeach subjectTeach) {
        this.subjectTeach = subjectTeach;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getDateGrade() {
        return dateGrade;
    }

    public void setDateGrade(Date dateGrade) {
        this.dateGrade = dateGrade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "idGrade=" + idGrade +
                ", student=" + student +
                ", subjectTeach=" + subjectTeach +
                ", grade=" + grade +
                ", dateGrade=" + dateGrade +
                '}';
    }
}
