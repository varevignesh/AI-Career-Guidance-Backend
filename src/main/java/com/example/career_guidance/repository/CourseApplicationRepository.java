package com.example.career_guidance.repository;

import com.example.career_guidance.entity.CourseApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseApplicationRepository
        extends JpaRepository<CourseApplication, Long> {

    List<CourseApplication> findByStudentIdOrderByAppliedAtDesc(Long studentId);
}