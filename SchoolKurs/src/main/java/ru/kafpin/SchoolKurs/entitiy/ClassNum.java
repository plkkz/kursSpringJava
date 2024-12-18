package ru.kafpin.SchoolKurs.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "classnums")
public class ClassNum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher; // Один класс ведет только одного учителя

    @OneToMany(mappedBy = "classNum")
    private List<Student> students; // Один класс может содержать много учеников

    @OneToMany(mappedBy = "classNum")
    private List<Attendance> attendances; // Один класс может иметь много записей о посещаемости
}


