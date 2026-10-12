package com.example.career_guidance.config;

import com.example.career_guidance.entity.Certification;
import com.example.career_guidance.entity.Course;
import com.example.career_guidance.repository.CertificationRepository;
import com.example.career_guidance.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CertificationDataLoader {

    @Bean
    CommandLineRunner loadCertifications(
            CertificationRepository certificationRepository,
            CourseRepository courseRepository) {

        return args -> {

            if (certificationRepository.count() > 0) {
                return;
            }

            Course cse = courseRepository
                    .findByName("B.Tech Computer Science and Engineering")
                    .orElseThrow();

            Course aiMl = courseRepository
                    .findByName("B.Tech Artificial Intelligence and Machine Learning")
                    .orElseThrow();

            Course cyberSecurity = courseRepository
                    .findByName("B.Tech Cyber Security")
                    .orElseThrow();

            Course dataScience = courseRepository
                    .findByName("B.Tech Data Science")
                    .orElseThrow();

            Course ece = courseRepository
                    .findByName("B.Tech Electronics and Communication Engineering")
                    .orElseThrow();

            // CSE Certifications

            certificationRepository.save(
                    new Certification(
                            cse,
                            "Java Programming",
                            "Oracle",
                            "Associate",
                            2,
                            "https://education.oracle.com/java-se-17-developer"
                    )
            );

            certificationRepository.save(
                    new Certification(
                            cse,
                            "AWS Certified Cloud Practitioner",
                            "Amazon Web Services",
                            "Foundational",
                            3,
                            "https://aws.amazon.com/certification/certified-cloud-practitioner/"
                    )
            );

            certificationRepository.save(
                    new Certification(
                            cse,
                            "Microsoft Certified: Azure Fundamentals",
                            "Microsoft",
                            "Beginner",
                            3,
                            "https://learn.microsoft.com/credentials/certifications/azure-fundamentals/"
                    )
            );

            // AI & ML Certifications

            certificationRepository.save(
                    new Certification(
                            aiMl,
                            "TensorFlow Developer",
                            "TensorFlow",
                            "Professional",
                            3,
                            "https://www.tensorflow.org/certificate"
                    )
            );

            certificationRepository.save(
                    new Certification(
                            aiMl,
                            "AWS Certified Machine Learning Engineer",
                            "Amazon Web Services",
                            "Professional",
                            4,
                            "https://aws.amazon.com/certification/"
                    )
            );

            // Cyber Security Certifications

            certificationRepository.save(
                    new Certification(
                            cyberSecurity,
                            "CompTIA Security+",
                            "CompTIA",
                            "Intermediate",
                            2,
                            "https://www.comptia.org/certifications/security"
                    )
            );

            certificationRepository.save(
                    new Certification(
                            cyberSecurity,
                            "Certified Ethical Hacker",
                            "EC-Council",
                            "Professional",
                            3,
                            "https://www.eccouncil.org/train-certify/certified-ethical-hacker-ceh/"
                    )
            );

            certificationRepository.save(
                    new Certification(
                            cyberSecurity,
                            "Cisco Certified Support Technician Cybersecurity",
                            "Cisco",
                            "Beginner",
                            2,
                            "https://www.cisco.com/site/us/en/learn/training-certifications/certifications/support-technician/cybersecurity/index.html"
                    )
            );

            // Data Science Certifications

            certificationRepository.save(
                    new Certification(
                            dataScience,
                            "Microsoft Certified: Azure Data Scientist Associate",
                            "Microsoft",
                            "Associate",
                            3,
                            "https://learn.microsoft.com/credentials/certifications/azure-data-scientist/"
                    )
            );

            certificationRepository.save(
                    new Certification(
                            dataScience,
                            "Google Cloud Professional Data Engineer",
                            "Google Cloud",
                            "Professional",
                            4,
                            "https://cloud.google.com/learn/certification/data-engineer"
                    )
            );

            // Electronics & Communication Certifications

            certificationRepository.save(
                    new Certification(
                            ece,
                            "Cisco Certified Support Technician Networking",
                            "Cisco",
                            "Beginner",
                            2,
                            "https://www.cisco.com/site/us/en/learn/training-certifications/certifications/support-technician/networking/index.html"
                    )
            );

            certificationRepository.save(
                    new Certification(
                            ece,
                            "Altium Certified Professional",
                            "Altium",
                            "Professional",
                            3,
                            "https://www.altium.com/"
                    )
            );
        };
    }
}