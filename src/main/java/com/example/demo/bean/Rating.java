package com.example.demo.bean;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="rating")
public class Rating {
    @Id
    @Generated
    Integer id;

    @ManyToOne

    @JoinColumn(name="studentid")
    Student student;

    @ManyToOne

    @JoinColumn(name="courseid")
    Course course;


    @Column(name = "rating")
    Integer rating;

    public Rating() {
    }

    public Rating( Student student, Course course, Integer rating) {

        this.student = student;
        this.course = course;
        this.rating = rating;
    }

    public Rating(Integer id, Student student, Course course, Integer rating) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.rating = rating;
    }
}
