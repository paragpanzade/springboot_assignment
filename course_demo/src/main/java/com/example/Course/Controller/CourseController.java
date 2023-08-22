package com.example.Course.Controller;

import com.example.Course.Entity.CourceEntity;
import com.example.Course.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<CourceEntity> create(@RequestBody CourceEntity courceEntity)
    {
        return ResponseEntity.ok().body(this.courseService.create(courceEntity));
    }

    @GetMapping("/read")
    public List<CourceEntity> getData()
    {
        return courseService.getAllProduct();
    }

    @PutMapping("/update/{courseId}")
    public CourceEntity updateCourse(@PathVariable("courseId")Long id,@RequestBody CourceEntity courceEntity)
    {
        return this.courseService.updateCourse(id,courceEntity);
    }

    @DeleteMapping("/delete/{courseId}")
    public ResponseEntity<String> deleteCourse(@PathVariable("courseId")Long id)
    {
        return ResponseEntity.ok().body(this.courseService.deleteCourse(id));
    }



}
