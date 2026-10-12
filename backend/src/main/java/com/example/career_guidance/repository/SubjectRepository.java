package com.example.career_guidance.repository;

import com.example.career_guidance.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    List<Subject> findByCourseIdOrderByYearNumberAscSemesterNumberAsc(Long courseId);
}
