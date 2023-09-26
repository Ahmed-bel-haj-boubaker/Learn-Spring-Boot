package com.learnspringboot.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return  List.of(
                new Student(
                        "ahmed",
                        "bel haj boubaker",
                        LocalDate.now(),
                        "ahmed.gmail.com",
                        23
                ),
                new Student(
                        "amine",
                        "laouiti",
                        LocalDate.now(),
                        "amine.gmail.com",
                        22
                )

        );
    }
}
