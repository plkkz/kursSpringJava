package ru.kafpin.SchoolKurs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kafpin.SchoolKurs.entitiy.Student;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByClassNum(String classNum);
}

