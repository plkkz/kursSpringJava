package ru.kafpin.SchoolKurs.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStudent")
    private Long idStudent;
    private String surnameStudent;
    private String nameStudent;
    private String patronymStudent;
    private Date birthdate;
    private ClassNum classnum;


    public Student(Long idStudent, String surnameStudent, String nameStudent, String patronymStudent, Date birthdate, ClassNum classnum) {
        this.idStudent = idStudent;
        this.surnameStudent = surnameStudent;
        this.nameStudent = nameStudent;
        this.patronymStudent = patronymStudent;
        this.birthdate = birthdate;
        this.classnum = classnum;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }


    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public ClassNum getClassnum() {
        return classnum;
    }

    public void setClassnum(ClassNum classnum) {
        this.classnum = classnum;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getPatronymStudent() {
        return patronymStudent;
    }

    public void setPatronymStudent(String patronymStudent) {
        this.patronymStudent = patronymStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", surnameStudent='" + surnameStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", patronymStudent='" + patronymStudent + '\'' +
                ", birthdate=" + birthdate +
                ", classnum=" + classnum +
                '}';
    }
}
