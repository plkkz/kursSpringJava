package ru.kafpin.SchoolKurs.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDTO {
    private Long id;
    private String surname;
    private String name;
    private String patronym;
    private String phonenumber;
}