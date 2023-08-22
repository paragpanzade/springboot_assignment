package com.example.Course.ServiceImp;

import com.example.Course.Entity.CourceEntity;
import com.example.Course.Repository.CourseRepository;
import com.example.Course.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourceServiceImp implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    public CourceEntity create(CourceEntity courceEntity)
    {
        return courseRepository.save(courceEntity);

    }
    @Autowired
    public List<CourceEntity> getAllProduct()
    {
        return courseRepository.findAll();
    }



    public CourceEntity updateCourse(Long id, CourceEntity courceEntity) {
        Optional<CourceEntity> curs = courseRepository.findById(id);
        if (curs.isPresent())
            return courseRepository.save(courceEntity);
        else
            return null;

    }
    @Override
    public String deleteCourse(Long id) {
        courseRepository.deleteById(id);
        return "No Contain of employee table";
    }
}
