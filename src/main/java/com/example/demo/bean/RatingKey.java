package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RatingKey  implements Serializable {
    @Column(name = "studentid")
    Integer studentId;

    @Column(name ="courseid")
    Integer courseId;

    public RatingKey(Integer studentId, Integer courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public RatingKey() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingKey ratingKey = (RatingKey) o;
        return Objects.equals(studentId, ratingKey.studentId) && Objects.equals(courseId, ratingKey.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseId);
    }
}
