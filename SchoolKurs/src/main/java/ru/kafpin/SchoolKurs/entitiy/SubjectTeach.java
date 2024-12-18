package ru.kafpin.SchoolKurs.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "subject_teaches")
public class SubjectTeach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "subjectTeach")
    private List<Grade> grades; // Один предмет может иметь много оценок

    @OneToMany(mappedBy = "subjectTeach")
    private List<Homework> homeworks; // Один предмет может иметь много домашних заданий
}

