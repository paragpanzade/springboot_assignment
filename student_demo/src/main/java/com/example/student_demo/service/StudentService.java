package com.example.student_demo.service;

import com.example.student_demo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Student createStudent(Student student);

    public List<Student> readAllStudents();

    public Optional<Student> readStudentById(Long id);

    public String updateStudent(Long id, Student student);

    public String deleteStudent(Long id);

}
