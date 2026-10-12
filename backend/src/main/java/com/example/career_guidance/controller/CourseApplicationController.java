package com.example.career_guidance.controller;

import com.example.career_guidance.dto.CourseApplicationRequest;
import com.example.career_guidance.entity.CourseApplication;
import com.example.career_guidance.service.CourseApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class CourseApplicationController {

    private final CourseApplicationService courseApplicationService;

    public CourseApplicationController(
            CourseApplicationService courseApplicationService) {
        this.courseApplicationService = courseApplicationService;
    }

    @PostMapping
    public CourseApplication apply(
            @RequestBody CourseApplicationRequest request) {

        return courseApplicationService.apply(request);
    }

    @GetMapping("/student/{studentId}")
    public List<CourseApplication> getStudentApplications(
            @PathVariable Long studentId) {

        return courseApplicationService
                .getApplicationsByStudent(studentId);
    }
}