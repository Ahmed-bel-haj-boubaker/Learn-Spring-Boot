package com.learnspringboot.springdemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DBStudentService implements StudentService {
    private final studentRepository repository;
    public DBStudentService(studentRepository repository) {
        this.repository = repository;
    }



    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }

    @Override
    public void delete(String email) {
repository.deleteByEmail(email);
    }
}
