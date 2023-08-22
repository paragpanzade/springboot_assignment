package com.example.student_demo.controller;

import com.example.student_demo.entity.Student;
import com.example.student_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return ResponseEntity.ok().body(this.studentService.createStudent(student));
    }

    @GetMapping("/student")
    public List<Student> readAllStudents(){
        return this.studentService.readAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> readStudentById(@PathVariable("id") Long id){
        return this.studentService.readStudentById(id);
    }

    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
        return this.studentService.updateStudent(id, student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        return this.studentService.deleteStudent(id);
    }
}
