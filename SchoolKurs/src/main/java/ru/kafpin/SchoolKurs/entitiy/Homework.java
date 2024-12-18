package ru.kafpin.SchoolKurs.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "homeworks")
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToOne
    @JoinColumn(name = "subjectteach_id")
    private SubjectTeach subjectTeach; // Каждое домашнее задание относится только к одному предмету

    @OneToMany(mappedBy = "homework")
    private List<HomeworkGrade> homeworkGrades; // Одно домашнее задание может иметь много оценок
}

