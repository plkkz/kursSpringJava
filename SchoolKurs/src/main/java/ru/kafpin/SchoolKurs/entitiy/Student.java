package ru.kafpin.SchoolKurs.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;
    private String name;
    private String patronym;
    private String phonenumber;

    @ManyToOne
    @JoinColumn(name = "classnum_id")
    private ClassNum classNum; // Один ученик принадлежит только одному классу

    @OneToMany(mappedBy = "student")
    private List<Attendance> attendances; // Один ученик может иметь много записей о посещаемости

    @OneToMany(mappedBy = "student")
    private List<Grade> grades; // Один ученик может иметь много оценок

    @OneToMany(mappedBy = "student")
    private List<HomeworkGrade> homeworkGrades; // Один ученик может иметь много оценок за домашние задания
}
