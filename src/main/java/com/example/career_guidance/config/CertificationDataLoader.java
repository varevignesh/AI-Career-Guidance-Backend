package com.example.career_guidance.config;

import com.example.career_guidance.entity.Certification;
import com.example.career_guidance.entity.Course;
import com.example.career_guidance.repository.CertificationRepository;
import com.example.career_guidance.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class CertificationDataLoader {

    @Bean
    CommandLineRunner loadCertifications(
            CertificationRepository certificationRepository,
            CourseRepository courseRepository) {

        return args -> {

            Optional<Course> cse = courseRepository.findByName(
                    "B.Tech Computer Science and Engineering");
            Optional<Course> aiMl = courseRepository.findByName(
                    "B.Tech Artificial Intelligence and Machine Learning");
            Optional<Course> cyberSecurity = courseRepository.findByName(
                    "B.Tech Cyber Security");
            Optional<Course> dataScience = courseRepository.findByName(
                    "B.Tech Data Science");
            Optional<Course> ece = courseRepository.findByName(
                    "B.Tech Electronics and Communication Engineering");

            if (cse.isEmpty() || aiMl.isEmpty()
                    || cyberSecurity.isEmpty() || dataScience.isEmpty()
                    || ece.isEmpty()) {
                System.err.println(
                    "Certification data not loaded: one or more required courses are missing. Check CourseDataLoader.");
                return;
            }

            saveIfMissing(certificationRepository, cse.get(),
                    "Java Programming", "Oracle", "Associate", 2,
                    "https://education.oracle.com/java-se-17-developer");

            saveIfMissing(certificationRepository, cse.get(),
                    "AWS Certified Cloud Practitioner", "Amazon Web Services",
                    "Foundational", 3,
                    "https://aws.amazon.com/certification/certified-cloud-practitioner/");

            saveIfMissing(certificationRepository, cse.get(),
                    "Microsoft Certified: Azure Fundamentals", "Microsoft",
                    "Beginner", 3,
                    "https://learn.microsoft.com/credentials/certifications/azure-fundamentals/");

            saveIfMissing(certificationRepository, aiMl.get(),
                    "TensorFlow Developer", "TensorFlow", "Professional", 3,
                    "https://www.tensorflow.org/certificate");

            saveIfMissing(certificationRepository, aiMl.get(),
                    "AWS Certified Machine Learning Engineer",
                    "Amazon Web Services", "Professional", 4,
                    "https://aws.amazon.com/certification/");

            saveIfMissing(certificationRepository, cyberSecurity.get(),
                    "CompTIA Security+", "CompTIA", "Intermediate", 2,
                    "https://www.comptia.org/certifications/security");

            saveIfMissing(certificationRepository, cyberSecurity.get(),
                    "Certified Ethical Hacker", "EC-Council", "Professional", 3,
                    "https://www.eccouncil.org/train-certify/certified-ethical-hacker-ceh/");

            saveIfMissing(certificationRepository, cyberSecurity.get(),
                    "Cisco Certified Support Technician Cybersecurity",
                    "Cisco", "Beginner", 2,
                    "https://www.cisco.com/site/us/en/learn/training-certifications/certifications/support-technician/cybersecurity/index.html");

            saveIfMissing(certificationRepository, dataScience.get(),
                    "Microsoft Certified: Azure Data Scientist Associate",
                    "Microsoft", "Associate", 3,
                    "https://learn.microsoft.com/credentials/certifications/azure-data-scientist/");

            saveIfMissing(certificationRepository, dataScience.get(),
                    "Google Cloud Professional Data Engineer", "Google Cloud",
                    "Professional", 4,
                    "https://cloud.google.com/learn/certification/data-engineer");

            saveIfMissing(certificationRepository, ece.get(),
                    "Cisco Certified Support Technician Networking",
                    "Cisco", "Beginner", 2,
                    "https://www.cisco.com/site/us/en/learn/training-certifications/certifications/support-technician/networking/index.html");

            saveIfMissing(certificationRepository, ece.get(),
                    "Altium Certified Professional", "Altium", "Professional", 3,
                    "https://www.altium.com/");
        };
    }

    private void saveIfMissing(
            CertificationRepository repository,
            Course course,
            String name,
            String provider,
            String level,
            int duration,
            String url) {

        boolean exists = repository.findAll().stream()
                .anyMatch(certification ->
                        certification.getName().equalsIgnoreCase(name));

        if (!exists) {
            repository.save(new Certification(
                    course, name, provider, level, duration, url));
        }
    }
}
