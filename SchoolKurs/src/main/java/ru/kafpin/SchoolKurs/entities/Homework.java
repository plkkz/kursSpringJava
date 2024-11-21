package ru.kafpin.SchoolKurs.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHomework")
    private Long idHomework;
    private SubjectTeach subjectTeach;
    private String title;
    private String description;
    private Date dueDateHomework;

    public Homework(Long idHomework, SubjectTeach subjectTeach, String title, String description, Date dueDateHomework) {
        this.idHomework = idHomework;
        this.subjectTeach = subjectTeach;
        this.title = title;
        this.description = description;
        this.dueDateHomework = dueDateHomework;
    }

    public Long getIdHomework() {
        return idHomework;
    }

    public void setIdHomework(Long idHomework) {
        this.idHomework = idHomework;
    }

    public SubjectTeach getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(SubjectTeach subjectTeach) {
        this.subjectTeach = subjectTeach;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDateHomework() {
        return dueDateHomework;
    }

    public void setDueDateHomework(Date dueDateHomework) {
        this.dueDateHomework = dueDateHomework;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "idHomework=" + idHomework +
                ", subjectTeach=" + subjectTeach +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDateHomework=" + dueDateHomework +
                '}';
    }
}
