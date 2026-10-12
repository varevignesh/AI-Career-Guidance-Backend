package com.example.career_guidance.controller;

import com.example.career_guidance.entity.Certification;
import com.example.career_guidance.repository.CertificationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CertificationController {

    private final CertificationRepository certificationRepository;

    public CertificationController(CertificationRepository certificationRepository) {
        this.certificationRepository = certificationRepository;
    }

    @GetMapping("/{courseId}/certifications")
    public List<Certification> getCertifications(@PathVariable Long courseId) {
        return certificationRepository
                .findByCourseIdOrderByRecommendedYearAsc(courseId);
    }
}