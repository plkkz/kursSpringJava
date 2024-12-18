package ru.kafpin.SchoolKurs.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "homework_grades")
public class HomeworkGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int grade; // Оценка за домашнее задание

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student; // Каждая оценка за домашнее задание относится только к одному ученику

    @ManyToOne
    @JoinColumn(name = "homework_id")
    private Homework homework; // Каждая оценка за домашнее задание относится только к одному домашнему заданию
}

