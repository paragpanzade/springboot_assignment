package com.example.Course.Repository;

import com.example.Course.Entity.CourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourceEntity, Long> {

}
