package com.example.career_guidance.config;

import com.example.career_guidance.entity.Course;
import com.example.career_guidance.entity.Roadmap;
import com.example.career_guidance.repository.CourseRepository;
import com.example.career_guidance.repository.RoadmapRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoadmapDataLoader {

    @Bean
    CommandLineRunner loadRoadmap(
            CourseRepository courseRepository,
            RoadmapRepository roadmapRepository) {

        return args -> {

            if (roadmapRepository.count() > 0) {
                return;
            }

            Course cse = courseRepository.findAll()
                    .stream()
                    .filter(course -> course.getName().equals(
                            "B.Tech Computer Science and Engineering"))
                    .findFirst()
                    .orElse(null);

            if (cse == null) {
                return;
            }

            roadmapRepository.save(new Roadmap(
                    cse,
                    1,
                    "Programming & Computer Fundamentals",
                    "Learn programming fundamentals, problem solving, mathematics, computer fundamentals and basic database concepts."
            ));

            roadmapRepository.save(new Roadmap(
                    cse,
                    2,
                    "Core Computer Science",
                    "Study data structures, algorithms, object-oriented programming, database management systems and operating systems."
            ));

            roadmapRepository.save(new Roadmap(
                    cse,
                    3,
                    "Advanced Development & Technologies",
                    "Learn computer networks, web development, software engineering, cloud fundamentals and build practical projects."
            ));

            roadmapRepository.save(new Roadmap(
                    cse,
                    4,
                    "Specialization, Internship & Major Project",
                    "Choose advanced areas such as AI, cybersecurity or cloud computing, complete an internship and develop a major project."
            ));
        };
    }
}
