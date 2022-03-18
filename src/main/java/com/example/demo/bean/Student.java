package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="student")
public class Student {
    @Id
    Integer id;

    @Column(name="studentname")
    String studentName;

//    @OneToMany(mappedBy = "student")
//    Set<Rating> ratings;
//    @ManyToMany
//    @JoinTable(name="student_course", joinColumns = @JoinColumn(name="studentid"), inverseJoinColumns = @JoinColumn(name="courseid"))
//    private Set<Course> likedCourses;

//    public Student(Integer id, String studentName, Set<Course> likedCourses) {
//        this.id = id;
//        this.studentName = studentName;
//        this.likedCourses = likedCourses;
//    }

    public Student(Integer id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +

                '}';
    }
}
