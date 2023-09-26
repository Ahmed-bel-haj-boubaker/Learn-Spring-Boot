package com.learnspringboot.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Student,Integer> {

 Student findByEmail(String email);
 void deleteByEmail(String email);

}
