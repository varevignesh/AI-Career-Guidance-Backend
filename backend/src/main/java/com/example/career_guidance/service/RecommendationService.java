package com.example.career_guidance.service;

import com.example.career_guidance.dto.RecommendationResponse;
import com.example.career_guidance.entity.Course;
import com.example.career_guidance.entity.CourseInterest;
import com.example.career_guidance.repository.CourseInterestRepository;
import com.example.career_guidance.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RecommendationService {

    private final CourseRepository courseRepository;
    private final CourseInterestRepository courseInterestRepository;

    public RecommendationService(
            CourseRepository courseRepository,
            CourseInterestRepository courseInterestRepository) {

        this.courseRepository = courseRepository;
        this.courseInterestRepository = courseInterestRepository;
    }

    public List<RecommendationResponse> recommendCourses(List<Long> selectedInterestIds) {

        if (selectedInterestIds == null || selectedInterestIds.isEmpty()) {
            return new ArrayList<>();
        }

        Set<Long> selectedIds = new HashSet<>(selectedInterestIds);

        List<RecommendationResponse> recommendations = new ArrayList<>();

        for (Course course : courseRepository.findAll()) {

            List<CourseInterest> mappings =
                    courseInterestRepository.findByCourseId(course.getId());

            List<String> matchedInterests = new ArrayList<>();

            for (CourseInterest mapping : mappings) {

                Long interestId = mapping.getInterest().getId();

                if (selectedIds.contains(interestId)) {
                    matchedInterests.add(mapping.getInterest().getName());
                }
            }

            double matchPercentage =
                    ((double) matchedInterests.size() / selectedIds.size()) * 100;

            if (!matchedInterests.isEmpty()) {

                recommendations.add(
                        new RecommendationResponse(
                                course.getId(),
                                course.getName(),
                                course.getDescription(),
                                Math.round(matchPercentage * 100.0) / 100.0,
                                matchedInterests
                        )
                );
            }
        }

        recommendations.sort(
                Comparator.comparing(
                        RecommendationResponse::getMatchPercentage
                ).reversed()
        );

        return recommendations;
    }
}
