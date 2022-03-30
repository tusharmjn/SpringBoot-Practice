package com.springrest.jpa.services;

import java.util.List;

import com.springrest.jpa.entities.Course;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(Long courseId);

    public Course addCourse(Course course);

//    public String updateCourse(Course course);

    public Course updateCourse(Course course);

}
