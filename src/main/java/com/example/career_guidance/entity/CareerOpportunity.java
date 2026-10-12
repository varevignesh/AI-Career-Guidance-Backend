
package com.example.career_guidance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "career_opportunities")
public class CareerOpportunity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(nullable = false, length = 200)
    private String jobRole;

    @Column(length = 2000)
    private String description;

    @Column(length = 2000)
    private String requiredSkills;

    @Column(length = 1000)
    private String workEnvironment;

    public CareerOpportunity() {
    }

    public CareerOpportunity(Course course, String jobRole, String description,
                             String requiredSkills, String workEnvironment) {
        this.course = course;
        this.jobRole = jobRole;
        this.description = description;
        this.requiredSkills = requiredSkills;
        this.workEnvironment = workEnvironment;
    }

    public Long getId() { return id; }
    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }
    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getRequiredSkills() { return requiredSkills; }
    public void setRequiredSkills(String requiredSkills) { this.requiredSkills = requiredSkills; }
    public String getWorkEnvironment() { return workEnvironment; }
    public void setWorkEnvironment(String workEnvironment) { this.workEnvironment = workEnvironment; }
}
