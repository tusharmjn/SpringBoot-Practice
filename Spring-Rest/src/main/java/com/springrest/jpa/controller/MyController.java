package com.springrest.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.jpa.entities.Course;
import com.springrest.jpa.services.CourseService;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "this is home page";
    }

//        @GetMapping(path="/courses",method = RequestMethod.GET)
    @GetMapping("/courses")
    public List<Course> getCourses() {

        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable Long courseId) {

        return courseService.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {

        return courseService.addCourse(course);

    }

    @PutMapping("/courses")
//        public String updateCourse(@RequestBody Course course) {
//            return courseService.updateCourse(course);
//        }
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }
}
