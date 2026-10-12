package com.example.career_guidance.controller;

import com.example.career_guidance.entity.Subject;
import com.example.career_guidance.repository.SubjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class SubjectController {

    private final SubjectRepository subjectRepository;

    public SubjectController(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @GetMapping("/{courseId}/subjects")
    public List<Subject> getSubjects(@PathVariable Long courseId) {
        return subjectRepository
                .findByCourseIdOrderByYearNumberAscSemesterNumberAsc(courseId);
    }
}
