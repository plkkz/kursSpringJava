package ru.kafpin.SchoolKurs.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class SubjectTeach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSubjectTeach")
    private Long idSubjectTeach;
    private String subjectName;

    public SubjectTeach(Long idSubjectTeach, String subjectName) {
        this.idSubjectTeach = idSubjectTeach;
        this.subjectName = subjectName;
    }

    public Long getIdSubjectTeach() {
        return idSubjectTeach;
    }

    public void setIdSubjectTeach(Long idSubjectTeach) {
        this.idSubjectTeach = idSubjectTeach;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "SubjectTeach{" +
                "idSubjectTeach=" + idSubjectTeach +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
