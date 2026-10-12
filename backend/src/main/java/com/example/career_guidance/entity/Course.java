package com.example.career_guidance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(length = 2000)
    private String description;

    @Column(length = 2000)
    private String whyUseful;

    @Column(length = 2000)
    private String societyImpact;

    @Column(length = 2000)
    private String studyEnvironment;

    @Column(length = 2000)
    private String workEnvironment;

    @Column(length = 2000)
    private String skillsRequired;

    @Column(length = 2000)
    private String futureScope;

    private String duration;

    @Column(length = 1000)
    private String eligibility;

    public Course() {
    }

    public Course(
            String name,
            String description,
            String whyUseful,
            String societyImpact,
            String studyEnvironment,
            String workEnvironment,
            String skillsRequired,
            String futureScope,
            String duration,
            String eligibility
    ) {
        this.name = name;
        this.description = description;
        this.whyUseful = whyUseful;
        this.societyImpact = societyImpact;
        this.studyEnvironment = studyEnvironment;
        this.workEnvironment = workEnvironment;
        this.skillsRequired = skillsRequired;
        this.futureScope = futureScope;
        this.duration = duration;
        this.eligibility = eligibility;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWhyUseful() {
        return whyUseful;
    }

    public void setWhyUseful(String whyUseful) {
        this.whyUseful = whyUseful;
    }

    public String getSocietyImpact() {
        return societyImpact;
    }

    public void setSocietyImpact(String societyImpact) {
        this.societyImpact = societyImpact;
    }

    public String getStudyEnvironment() {
        return studyEnvironment;
    }

    public void setStudyEnvironment(String studyEnvironment) {
        this.studyEnvironment = studyEnvironment;
    }

    public String getWorkEnvironment() {
        return workEnvironment;
    }

    public void setWorkEnvironment(String workEnvironment) {
        this.workEnvironment = workEnvironment;
    }

    public String getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(String skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    public String getFutureScope() {
        return futureScope;
    }

    public void setFutureScope(String futureScope) {
        this.futureScope = futureScope;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }
}
