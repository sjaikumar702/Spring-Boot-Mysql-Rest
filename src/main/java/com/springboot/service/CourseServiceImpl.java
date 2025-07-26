package com.springboot.service;

import com.springboot.model.Course;
import com.springboot.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
    }

    @Override
    public String upsert(Course course) {
        courseRepository.save(course); //Update or insert based on PK
        return "SUCCESS";
    }

    @Override
    public Course getById(Integer id) {
        Optional<Course> findbyId = courseRepository.findById(id);
        return findbyId.orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public String deleteById(Integer id) {
        if(courseRepository.existsById(id)){
            courseRepository.deleteById(id);
        }else {
            return "No record found";
        }
        return "Delete Successful";
    }
}
