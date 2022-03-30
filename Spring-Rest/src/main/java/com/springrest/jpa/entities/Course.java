package com.springrest.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Title")
    private String title;
    @Column(name = "Description")
    private String description;

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Course() {
//        super();
    }

//    public long getId() {
//        return id;
//    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Courses [id=" + id + ", title=" + title + ", description=" + description + "]";
    }

}
