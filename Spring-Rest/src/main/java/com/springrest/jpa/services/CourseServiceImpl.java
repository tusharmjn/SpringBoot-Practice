package com.springrest.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.jpa.entities.Course;
import com.springrest.jpa.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

//  List<Course> list;
    @Autowired
    public CourseRepository courseRepo;

    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public Course getCourse(Long courseId) {

        return courseRepo.getById(courseId);
    }

    public Course addCourse(Course course) {
        courseRepo.save(course);
        return course;
    }

    public Course updateCourse(Course course) {
        courseRepo.save(course);
        return course;
    }

}
