package ru.kafpin.SchoolKurs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kafpin.SchoolKurs.entitiy.Student;
import ru.kafpin.SchoolKurs.DTO.StudentDTO;
import ru.kafpin.SchoolKurs.service.StudentService;

@RequestMapping("/api")
@RestController
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public Iterable<Student> listOfStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/student/add")
    public Student newStudent(@RequestBody StudentDTO studentDTO) {
        Student student = new Student();
        student.setSurname(studentDTO.getSurname());
        student.setName(studentDTO.getName());
        student.setPatronym(studentDTO.getPatronym());
        student.setPhonenumber(studentDTO.getPhonenumber());
        return studentService.addEditStudent(student);
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@RequestBody StudentDTO studentDTO, @PathVariable("id") Long id) {
        Student existStudent = studentService.getStudentById(id);
        Student student = new Student();
        student.setId(existStudent.getId());
        student.setSurname(studentDTO.getSurname());
        student.setName(studentDTO.getName());
        student.setPatronym(studentDTO.getPatronym());
        student.setPhonenumber(studentDTO.getPhonenumber());
        return studentService.addEditStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudentById(id);
    }
}
