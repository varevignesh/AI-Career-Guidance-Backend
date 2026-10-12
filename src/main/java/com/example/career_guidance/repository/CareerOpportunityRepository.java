package com.example.career_guidance.repository;

import com.example.career_guidance.entity.CareerOpportunity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CareerOpportunityRepository extends JpaRepository<CareerOpportunity, Long> {

    List<CareerOpportunity> findByCourseIdOrderByJobRoleAsc(Long courseId);
}