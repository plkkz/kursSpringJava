package ru.kafpin.SchoolKurs.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class HomeworkGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHomeworkGrade")
    private Long idHomeworkGrade;
    private Homework homework;
    private Student student;
    private int gradeHomework;

    public HomeworkGrade(Long idHomeworkGrade, Homework homework, Student student, int gradeHomework) {
        this.idHomeworkGrade = idHomeworkGrade;
        this.homework = homework;
        this.student = student;
        this.gradeHomework = gradeHomework;
    }

    public Long getIdHomeworkGrade() {
        return idHomeworkGrade;
    }

    public void setIdHomeworkGrade(Long idHomeworkGrade) {
        this.idHomeworkGrade = idHomeworkGrade;
    }

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getGradeHomework() {
        return gradeHomework;
    }

    public void setGradeHomework(int gradeHomework) {
        this.gradeHomework = gradeHomework;
    }

    @Override
    public String toString() {
        return "HomeworkGrade{" +
                "idHomeworkGrade=" + idHomeworkGrade +
                ", homework=" + homework +
                ", student=" + student +
                ", gradeHomework=" + gradeHomework +
                '}';
    }
}
