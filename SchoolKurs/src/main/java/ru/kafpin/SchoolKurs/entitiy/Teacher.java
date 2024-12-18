package ru.kafpin.SchoolKurs.entitiy;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;
    private String name;
    private String patronym;
    private String phonenumber;

    @OneToMany(mappedBy = "teacher")
    private List<ClassNum> classNums; // Один учитель может вести много классов
}

