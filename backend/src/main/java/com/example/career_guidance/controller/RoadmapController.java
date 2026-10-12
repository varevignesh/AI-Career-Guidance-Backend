package com.example.career_guidance.controller;

import com.example.career_guidance.entity.Roadmap;
import com.example.career_guidance.repository.RoadmapRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class RoadmapController {

    private final RoadmapRepository roadmapRepository;

    public RoadmapController(RoadmapRepository roadmapRepository) {
        this.roadmapRepository = roadmapRepository;
    }

    @GetMapping("/{courseId}/roadmap")
    public List<Roadmap> getRoadmap(@PathVariable Long courseId) {
        return roadmapRepository.findByCourseIdOrderByYearNumberAsc(courseId);
    }
}
