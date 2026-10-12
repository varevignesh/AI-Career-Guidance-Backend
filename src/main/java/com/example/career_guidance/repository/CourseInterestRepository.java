package com.example.career_guidance.repository;

import com.example.career_guidance.entity.CourseInterest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseInterestRepository extends JpaRepository<CourseInterest, Long> {

    List<CourseInterest> findByInterestId(Long interestId);

    List<CourseInterest> findByCourseId(Long courseId);
}
