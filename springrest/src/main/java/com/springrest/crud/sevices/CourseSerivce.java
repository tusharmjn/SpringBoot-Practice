package com.springrest.crud.sevices;

import java.util.List;

import com.springrest.crud.entities.Course;

public interface CourseSerivce {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

}
