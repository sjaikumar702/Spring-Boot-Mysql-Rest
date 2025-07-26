package com.springboot.controller;

import com.springboot.model.Course;
import com.springboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseRestController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody Course course){
        String status=courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @GetMapping("course/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable Integer id){
        Course course=courseService.getById(id);
        return new ResponseEntity<>(course,HttpStatus.OK);
    }
    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        List<Course>allCourses=courseService.getAllCourses();
        return new ResponseEntity<>(allCourses,HttpStatus.OK);
    }
    @PutMapping("/course")
    public ResponseEntity<String> updateCourse(@RequestBody Course course){
        String status=courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @DeleteMapping("course/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer id){
        String status=courseService.deleteById(id);
        return new ResponseEntity<>(status,HttpStatus.OK);
    }


}
