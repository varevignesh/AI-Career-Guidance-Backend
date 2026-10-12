package com.example.career_guidance.config;

import com.example.career_guidance.entity.Interest;
import com.example.career_guidance.repository.InterestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InterestDataLoader {

    @Bean
    CommandLineRunner loadInterests(InterestRepository repository) {
        return args -> {

            if (repository.count() == 0) {

                List<String> interests = List.of(
                    "Programming & Software Development",
                    "Cybersecurity & Ethical Hacking",
                    "AI & Machine Learning",
                    "Data & Analytics",
                    "Web Development",
                    "Mobile App Development",
                    "Cloud Computing",
                    "Game Development",
                    "UI/UX & Design",
                    "Computer Hardware & Networking",
                    "Robotics & Automation",
                    "Science & Research",
                    "Business & Entrepreneurship",
                    "Finance & FinTech",
                    "Healthcare & Medical Technology",
                    "Engineering & Construction",
                    "Electronics & Embedded Systems",
                    "Automobile Technology",
                    "Environment & Sustainability",
                    "Aviation & Aerospace",
                    "Telecommunications",
                    "Biotechnology",
                    "Management & Leadership",
                    "Content & Digital Media"
                );

                interests.forEach(name ->
                    repository.save(new Interest(name))
                );
            }
        };
    }
}
