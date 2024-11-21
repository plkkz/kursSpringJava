package ru.kafpin.SchoolKurs.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAttendance")
    private Long idAttendance;
    private Student student;
    private Date dateAttendance;
    private String status;

    public Attendance(Long idAttendance, Student student, Date dateAttendance, String status) {
        this.idAttendance = idAttendance;
        this.student = student;
        this.dateAttendance = dateAttendance;
        this.status = status;
    }

    public Long getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(Long idAttendance) {
        this.idAttendance = idAttendance;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDateAttendance() {
        return dateAttendance;
    }

    public void setDateAttendance(Date dateAttendance) {
        this.dateAttendance = dateAttendance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "idAttendance=" + idAttendance +
                ", student=" + student +
                ", dateAttendance=" + dateAttendance +
                ", status='" + status + '\'' +
                '}';
    }
}
