package com.karanu.crudApp.controller;

import com.karanu.crudApp.entity.Student;
import com.karanu.crudApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;
    // get all students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repo.findAll();
        return students;
    }
    // get one student
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = repo.findById(id).get();
        return student;
    }

    // create student
    @PostMapping("student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student) {
        repo.save(student);
    }
    //update student
    @PutMapping("student/update/{id}")
    public Student updateStudent(@PathVariable int id) {
       Student student = repo.findById(id).get();
       student.setName("mjoni");
       student.setPercentage(88);
       repo.save(student);
       return student;
    }
    //delete student
    @DeleteMapping("student/delete/{id}")
    public void removeStudent(@PathVariable int id) {
        Student student = repo.findById(id).get();
        repo.delete(student);
    }
}
