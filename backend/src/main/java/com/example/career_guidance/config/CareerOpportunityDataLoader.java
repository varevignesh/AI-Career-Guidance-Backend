package com.example.career_guidance.config;

import com.example.career_guidance.entity.CareerOpportunity;
import com.example.career_guidance.entity.Course;
import com.example.career_guidance.repository.CareerOpportunityRepository;
import com.example.career_guidance.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CareerOpportunityDataLoader {

    @Bean
    CommandLineRunner loadCareerOpportunities(
            CareerOpportunityRepository careerOpportunityRepository,
            CourseRepository courseRepository) {

        return args -> {

            if (careerOpportunityRepository.count() > 0) {
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

            // CSE Careers

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            cse,
                            "Software Developer",
                            "Designs, develops, tests and maintains software applications.",
                            "Java, Python, data structures, algorithms, databases, Git and problem solving.",
                            "Software companies, IT departments, startups and technology teams."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            cse,
                            "Backend Developer",
                            "Develops server-side applications, APIs and database-driven systems.",
                            "Java, Spring Boot, REST APIs, SQL, databases and Git.",
                            "Backend engineering teams, IT companies and product organizations."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            cse,
                            "Full Stack Developer",
                            "Works on both frontend and backend parts of web applications.",
                            "Java, Spring Boot, HTML, CSS, JavaScript, React, REST APIs and databases.",
                            "Web development teams, startups and software product companies."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            cse,
                            "Cloud Engineer",
                            "Designs and manages applications and infrastructure on cloud platforms.",
                            "Cloud computing, Linux, networking, Docker, DevOps and AWS/Azure.",
                            "Cloud teams, DevOps teams and technology organizations."
                    )
            );

            // AI & ML Careers

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            aiMl,
                            "AI Engineer",
                            "Builds intelligent applications using artificial intelligence techniques.",
                            "Python, machine learning, deep learning, mathematics and AI frameworks.",
                            "AI teams, technology companies, research organizations and startups."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            aiMl,
                            "Machine Learning Engineer",
                            "Develops and deploys machine learning models for real-world applications.",
                            "Python, machine learning, statistics, data processing and model deployment.",
                            "AI/ML teams, software companies, research labs and technology startups."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            aiMl,
                            "AI Research Assistant",
                            "Supports research and experimentation in artificial intelligence.",
                            "Machine learning, mathematics, statistics, programming and research skills.",
                            "Universities, research laboratories and R&D organizations."
                    )
            );

            // Cyber Security Careers

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            cyberSecurity,
                            "Cybersecurity Analyst",
                            "Monitors systems and networks to identify and respond to security threats.",
                            "Networking, Linux, security concepts, log analysis and incident response.",
                            "Security operations centers, IT companies and enterprise security teams."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            cyberSecurity,
                            "Security Engineer",
                            "Designs and maintains technical security controls and secure systems.",
                            "Networking, operating systems, cloud security, scripting and security tools.",
                            "Cybersecurity teams, cloud teams and enterprise IT departments."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            cyberSecurity,
                            "Ethical Security Tester",
                            "Authorizedly evaluates applications and systems for security weaknesses.",
                            "Networking, Linux, web security, scripting and security testing concepts.",
                            "Authorized security testing teams, consulting organizations and security departments."
                    )
            );

            // Data Science Careers

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            dataScience,
                            "Data Scientist",
                            "Analyzes data and builds statistical and machine learning models to support decisions.",
                            "Python, statistics, SQL, machine learning, data visualization and problem solving.",
                            "Analytics teams, technology companies, finance, healthcare and research organizations."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            dataScience,
                            "Data Analyst",
                            "Analyzes datasets and creates reports and visualizations for organizations.",
                            "SQL, Excel, Python, statistics, data visualization and communication.",
                            "Business intelligence teams, companies, consulting organizations and analytics departments."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            dataScience,
                            "Data Engineer",
                            "Builds systems and pipelines that collect, process and store data.",
                            "Python/Java, SQL, databases, ETL, cloud platforms and distributed systems.",
                            "Data engineering teams, cloud teams and large technology organizations."
                    )
            );

            // ECE Careers

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            ece,
                            "Embedded Systems Engineer",
                            "Develops software and hardware solutions for embedded devices.",
                            "C/C++, microcontrollers, electronics, embedded systems and debugging.",
                            "Electronics companies, automobile companies and embedded product teams."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            ece,
                            "Telecommunications Engineer",
                            "Works with communication networks and telecommunications systems.",
                            "Communication systems, networking, signal processing and wireless technologies.",
                            "Telecom companies, networking organizations and communication technology teams."
                    )
            );

            careerOpportunityRepository.save(
                    new CareerOpportunity(
                            ece,
                            "Electronics Design Engineer",
                            "Designs and tests electronic circuits and hardware systems.",
                            "Circuit design, electronics, PCB design, testing and technical documentation.",
                            "Electronics manufacturers, product companies and R&D organizations."
                    )
            );
        };
    }
}