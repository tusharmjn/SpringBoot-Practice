package com.springrest.crud.sevices;

import java.util.List;

import com.springrest.crud.entities.Course;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public String updateCourse(Course course);

//    public Course updateCourse(Course course);

}
