package ru.kafpin.SchoolKurs.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int value;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student; // Оценка относится только к одному ученику

    @ManyToOne
    @JoinColumn(name = "subjectteach_id")
    private SubjectTeach subjectTeach; // Оценка относится только к одному предмету
}

