package com.example.career_guidance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "certifications")
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(nullable = false, length = 300)
    private String name;

    @Column(nullable = false, length = 200)
    private String provider;

    @Column(length = 100)
    private String level;

    @Column(nullable = false)
    private Integer recommendedYear;

    @Column(length = 1000)
    private String officialUrl;

    public Certification() {
    }

    public Certification(
            Course course,
            String name,
            String provider,
            String level,
            Integer recommendedYear,
            String officialUrl) {
        this.course = course;
        this.name = name;
        this.provider = provider;
        this.level = level;
        this.recommendedYear = recommendedYear;
        this.officialUrl = officialUrl;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getRecommendedYear() {
        return recommendedYear;
    }

    public void setRecommendedYear(Integer recommendedYear) {
        this.recommendedYear = recommendedYear;
    }

    public String getOfficialUrl() {
        return officialUrl;
    }

    public void setOfficialUrl(String officialUrl) {
        this.officialUrl = officialUrl;
    }
}