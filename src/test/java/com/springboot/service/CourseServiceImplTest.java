package com.springboot.service;

import com.springboot.model.Course;
import com.springboot.repository.CourseRepository;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CourseServiceImplTest {

    @Mock
    private CourseRepository courseRepository;
    private CourseService courseService;

    AutoCloseable autoCloseable;
    Course course;

    @BeforeEach
    void setUp() {
        autoCloseable= MockitoAnnotations.openMocks(this);
        courseService=new CourseServiceImpl(courseRepository);
        course=new Course(6,"Spring Frameworks",2900.00);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void upsert() {
    mock(Course.class);
    mock(CourseRepository.class);

    when(courseRepository.save(course)).thenReturn(course);

    assertThat(courseService.upsert(course)).isEqualTo("SUCCESS");

    }

    private <SELF extends AbstractBigDecimalAssert<SELF>> AbstractBigDecimalAssert<SELF> assertThat(String upsert) {
        return null;
    }

    @Test
    void getById() {
    }

    @Test
    void getAllCourses() {
    }

    @Test
    void deleteById() {
    }
}