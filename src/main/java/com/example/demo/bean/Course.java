package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="course")
@Getter
@Setter

public class Course {
    @Id
    @GeneratedValue
    Integer id;

    @Column(name = "coursename")
    String courseName;

//    @OneToMany(mappedBy = "course")
//    Set<Rating> ratings;

//    @ManyToMany(mappedBy = "likedCourses")
//    private Set<Student> likes;
    public Course(Integer id) {
        this.id = id;
    }

    public Course(Integer id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Course() {

    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +

                '}';
    }
}
