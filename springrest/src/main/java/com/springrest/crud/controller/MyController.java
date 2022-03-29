package com.springrest.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.crud.entities.Course;
import com.springrest.crud.sevices.CourseSerivce;

@RestController
public class MyController {

    @Autowired
    private CourseSerivce courseSerivce;

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable Long courseId) {
        return this.courseService.getCourse(courseId);
    }
    
    @GetMapping("/home")
    public String home() {
        return "this is home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {

        return this.courseSerivce.getCourses();
    }

    

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {

        return this.courseService.addCourse(course);

    }
}