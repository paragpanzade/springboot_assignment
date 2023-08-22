package com.example.student_demo.serviceImpl;

import com.example.student_demo.entity.Student;
import com.example.student_demo.repository.StudentRepository;
import com.example.student_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository stu_repo;
    @Override
    public Student createStudent(Student student) {
        return stu_repo.save(student);
    }

    @Override
    public List<Student> readAllStudents() {
        return stu_repo.findAll();
    }

    @Override
    public Optional<Student> readStudentById(Long id) {
        if (stu_repo.existsById(id)) {
            return stu_repo.findById(id);
        }
        else {
            return null;
        }
    }

    @Override
    public String updateStudent(Long id, Student student) {
        if (stu_repo.existsById(id)) {
            stu_repo.save(student);
            return "Student Updated Successfully.";
        }
        else {
            return "Student not found !!!";
        }
    }

    @Override
    public String deleteStudent(Long id) {
        if (stu_repo.existsById(id)) {
            stu_repo.deleteById(id);
            return "Student Deleted Successfully.";
        }
        else {
            return "Student not found !!!";
        }
    }
}
