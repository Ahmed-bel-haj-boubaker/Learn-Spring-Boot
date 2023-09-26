package com.learnspringboot.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {

     List<Student> findAllStudents();
     Student save(Student s);
     Student findByEmail(String email);
     Student update(Student s);
     void delete(String email);


}
