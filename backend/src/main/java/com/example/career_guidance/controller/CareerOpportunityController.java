package com.example.career_guidance.controller;

import com.example.career_guidance.entity.CareerOpportunity;
import com.example.career_guidance.repository.CareerOpportunityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CareerOpportunityController {

    private final CareerOpportunityRepository careerOpportunityRepository;

    public CareerOpportunityController(
            CareerOpportunityRepository careerOpportunityRepository) {
        this.careerOpportunityRepository = careerOpportunityRepository;
    }

    @GetMapping("/{courseId}/careers")
    public List<CareerOpportunity> getCareerOpportunities(
            @PathVariable Long courseId) {

        return careerOpportunityRepository
                .findByCourseIdOrderByJobRoleAsc(courseId);
    }
}