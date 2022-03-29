package com.springrest.crud.sevices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.crud.entities.Course;

@Service
public class CourseServiceImpl implements CourseSerivce {

    List<Course> list;

    public CourseServiceImpl() {

        list = new ArrayList<>();
        list.add(new Course(123, "JAVA Core Course", "all java concepts"));
        list.add(new Course(345, "SpringBoot Core Course", "rest api concepts"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for (Course course : list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

}
