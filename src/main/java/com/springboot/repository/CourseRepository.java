package com.springboot.repository;

import com.springboot.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
//@Repository //-->optional
public interface CourseRepository extends JpaRepository<Course, Serializable> {
}
