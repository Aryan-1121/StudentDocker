package com.crud.student.controller;


import com.crud.student.entity.Student;
import com.crud.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @GetMapping()
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/insert")
    public ResponseEntity<Student> insertStudent(@RequestBody Student student){
        studentRepository.save(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }



}
