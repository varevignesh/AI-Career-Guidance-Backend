package com.example.career_guidance.dto;

import java.util.List;

public class RecommendationResponse {

    private Long courseId;
    private String courseName;
    private String description;
    private double matchPercentage;
    private List<String> matchedInterests;

    public RecommendationResponse() {
    }

    public RecommendationResponse(
            Long courseId,
            String courseName,
            String description,
            double matchPercentage,
            List<String> matchedInterests) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.matchPercentage = matchPercentage;
        this.matchedInterests = matchedInterests;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMatchPercentage() {
        return matchPercentage;
    }

    public void setMatchPercentage(double matchPercentage) {
        this.matchPercentage = matchPercentage;
    }

    public List<String> getMatchedInterests() {
        return matchedInterests;
    }

    public void setMatchedInterests(List<String> matchedInterests) {
        this.matchedInterests = matchedInterests;
    }
}
