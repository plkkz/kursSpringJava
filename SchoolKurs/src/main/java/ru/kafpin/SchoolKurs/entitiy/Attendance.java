package ru.kafpin.SchoolKurs.entitiy;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "attendances")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private boolean present;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student; // Каждая запись о посещаемости относится только к одному ученику

    @ManyToOne
    @JoinColumn(name = "classnum_id")
    private ClassNum classNum; // Каждая запись о посещаемости относится к одному классу
}

