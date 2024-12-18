package ru.kafpin.SchoolKurs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.kafpin.SchoolKurs.entitiy.Student;
import ru.kafpin.SchoolKurs.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        Student existingStudent = getStudentById(student.getIdStudent());
        if (existingStudent != null) {
            existingStudent.setSurnameStudent(student.getSurnameStudent());
            existingStudent.setNameStudent(student.getNameStudent());
            existingStudent.setPatronymStudent(student.getPatronymStudent());
            existingStudent.setBirthdate(student.getBirthdate());
            existingStudent.setClassnum(student.getClassnum());
            existingStudent.setEmail(student.getEmail());
            studentRepository.save(existingStudent);
        }
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> findStudentsByClass(String classNum) {
        return studentRepository.findByClassNum(classNum);
    }
}
