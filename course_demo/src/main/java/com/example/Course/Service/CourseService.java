package com.example.Course.Service;

import com.example.Course.Entity.CourceEntity;

import java.util.List;

public interface CourseService {

    public CourceEntity create(CourceEntity courceEntity);
    public List<CourceEntity> getAllProduct();
    String deleteCourse(Long id);
    CourceEntity updateCourse(Long id,CourceEntity courceEntity);
}
