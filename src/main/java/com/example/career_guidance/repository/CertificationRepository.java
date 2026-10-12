package com.example.career_guidance.repository;

import com.example.career_guidance.entity.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CertificationRepository extends JpaRepository<Certification, Long> {

    List<Certification> findByCourseIdOrderByRecommendedYearAsc(Long courseId);
}