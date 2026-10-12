package com.example.career_guidance.repository;

import com.example.career_guidance.entity.Roadmap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoadmapRepository extends JpaRepository<Roadmap, Long> {

    List<Roadmap> findByCourseIdOrderByYearNumberAsc(Long courseId);
}
