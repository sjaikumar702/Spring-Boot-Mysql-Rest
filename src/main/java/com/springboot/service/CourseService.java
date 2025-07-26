package com.springboot.service;

import com.springboot.model.Course;

import java.util.List;

public interface CourseService {

    public String upsert(Course course);//upsert-->polymorphic method used for both insert and update based on the primary key value

    public Course getById(Integer id);
    public List<Course> getAllCourses();
    public String deleteById(Integer id);
}
