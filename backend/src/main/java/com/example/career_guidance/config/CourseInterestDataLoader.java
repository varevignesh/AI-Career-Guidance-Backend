package com.example.career_guidance.config;

import com.example.career_guidance.entity.Course;
import com.example.career_guidance.entity.CourseInterest;
import com.example.career_guidance.entity.Interest;
import com.example.career_guidance.repository.CourseInterestRepository;
import com.example.career_guidance.repository.CourseRepository;
import com.example.career_guidance.repository.InterestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class CourseInterestDataLoader {

    @Bean
    CommandLineRunner loadCourseInterests(
            CourseRepository courseRepository,
            InterestRepository interestRepository,
            CourseInterestRepository mappingRepository) {

        return args -> {

            if (mappingRepository.count() > 0) {
                return;
            }

            Map<String, Course> courses = new HashMap<>();
            for (Course course : courseRepository.findAll()) {
                courses.put(course.getName(), course);
            }

            Map<String, Interest> interests = new HashMap<>();
            for (Interest interest : interestRepository.findAll()) {
                interests.put(interest.getName(), interest);
            }

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Computer Science and Engineering",
                    "Programming & Software Development");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Computer Science and Engineering",
                    "Web Development");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Computer Science and Engineering",
                    "Mobile App Development");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Computer Science and Engineering",
                    "Cloud Computing");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Computer Science and Engineering",
                    "Game Development");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Computer Science and Engineering",
                    "Computer Hardware & Networking");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Computer Science and Engineering",
                    "AI & Machine Learning");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Artificial Intelligence and Machine Learning",
                    "AI & Machine Learning");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Artificial Intelligence and Machine Learning",
                    "Data & Analytics");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Artificial Intelligence and Machine Learning",
                    "Programming & Software Development");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Artificial Intelligence and Machine Learning",
                    "Robotics & Automation");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Artificial Intelligence and Machine Learning",
                    "Science & Research");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Cyber Security",
                    "Cybersecurity & Ethical Hacking");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Cyber Security",
                    "Programming & Software Development");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Cyber Security",
                    "Computer Hardware & Networking");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Cyber Security",
                    "Cloud Computing");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Data Science",
                    "Data & Analytics");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Data Science",
                    "AI & Machine Learning");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Data Science",
                    "Programming & Software Development");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Data Science",
                    "Finance & FinTech");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Data Science",
                    "Science & Research");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Electronics and Communication Engineering",
                    "Electronics & Embedded Systems");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Electronics and Communication Engineering",
                    "Telecommunications");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Electronics and Communication Engineering",
                    "Robotics & Automation");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Electronics and Communication Engineering",
                    "Computer Hardware & Networking");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Electronics and Communication Engineering",
                    "Automobile Technology");

            addMapping(mappingRepository, courses, interests,
                    "B.Tech Electronics and Communication Engineering",
                    "Aviation & Aerospace");
        };
    }

    private void addMapping(
            CourseInterestRepository mappingRepository,
            Map<String, Course> courses,
            Map<String, Interest> interests,
            String courseName,
            String interestName) {

        Course course = courses.get(courseName);
        Interest interest = interests.get(interestName);

        if (course != null && interest != null) {
            mappingRepository.save(new CourseInterest(course, interest));
        }
    }
}
