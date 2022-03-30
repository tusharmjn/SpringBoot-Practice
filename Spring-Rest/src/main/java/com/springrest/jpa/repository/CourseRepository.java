package com.springrest.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.jpa.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
