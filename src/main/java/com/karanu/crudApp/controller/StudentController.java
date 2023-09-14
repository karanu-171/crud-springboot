package com.karanu.crudApp.controller;

import com.karanu.crudApp.entity.Student;
import com.karanu.crudApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;
    // get all students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return null;
    }
}
