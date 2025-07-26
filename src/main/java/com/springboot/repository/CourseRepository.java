package com.springboot.repository;

import com.springboot.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
public interface CourseRepository extends JpaRepository<Course, Serializable> {
}
