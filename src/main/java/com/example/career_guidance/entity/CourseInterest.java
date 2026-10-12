package com.example.career_guidance.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name = "course_interests",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"course_id", "interest_id"})
    }
)
public class CourseInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interest_id", nullable = false)
    private Interest interest;

    public CourseInterest() {
    }

    public CourseInterest(Course course, Interest interest) {
        this.course = course;
        this.interest = interest;
    }

    public Long getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }
}
