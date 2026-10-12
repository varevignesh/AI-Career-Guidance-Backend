package com.example.career_guidance.config;

import com.example.career_guidance.entity.Course;
import com.example.career_guidance.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseDataLoader {

    @Bean
    CommandLineRunner loadCourses(CourseRepository repository) {
        return args -> {

            List<Course> courses = List.of(

                new Course(
                    "B.Tech Computer Science and Engineering",
                    "A technology-focused undergraduate program covering programming, algorithms, databases, operating systems, computer networks and software engineering.",
                    "It provides a strong foundation for software development, technology careers and higher studies.",
                    "Computer science professionals contribute to software, digital services, automation, education, healthcare and many other sectors.",
                    "The study environment usually includes lectures, programming labs, projects, teamwork and technical assignments.",
                    "Work may involve software development, testing, system design, technical support, cloud platforms or research.",
                    "Programming, problem solving, logical thinking, databases, algorithms, communication and teamwork.",
                    "Strong long-term scope across software engineering, cloud, AI, cybersecurity, data and emerging technologies.",
                    "4 years",
                    "Typically 12th/Intermediate with the required subjects and admission requirements of the institution."
                ),

                new Course(
                    "B.Tech Artificial Intelligence and Machine Learning",
                    "An undergraduate technology program focused on artificial intelligence, machine learning, data processing, algorithms and intelligent systems.",
                    "It prepares students for careers involving intelligent applications, predictive systems and data-driven technology.",
                    "AI can support healthcare, agriculture, transportation, education, accessibility, business and scientific research.",
                    "Study includes mathematics, programming, laboratory work, machine learning projects and experimentation.",
                    "Work can involve developing, testing and deploying AI or machine learning systems and working with data.",
                    "Programming, mathematics, statistics, data handling, problem solving and analytical thinking.",
                    "Growing opportunities in AI engineering, machine learning, data science, automation and research.",
                    "4 years",
                    "Typically 12th/Intermediate with the required subjects and admission requirements of the institution."
                ),

                new Course(
                    "B.Tech Cyber Security",
                    "An undergraduate technology program focused on protecting systems, networks, applications and data from security threats.",
                    "It develops foundations for careers in cybersecurity, security operations, secure software and digital risk management.",
                    "Cybersecurity helps protect individuals, organizations, financial systems, healthcare systems and critical infrastructure.",
                    "Study includes networking, operating systems, programming, security laboratories, problem solving and practical exercises.",
                    "Work may involve security monitoring, vulnerability assessment, secure systems, incident response and security analysis.",
                    "Networking, operating systems, programming, security concepts, analytical thinking and continuous learning.",
                    "Strong scope as organizations increasingly need to protect digital systems, applications and data.",
                    "4 years",
                    "Typically 12th/Intermediate with the required subjects and admission requirements of the institution."
                ),

                new Course(
                    "B.Tech Data Science",
                    "An undergraduate program focused on statistics, programming, data analysis, databases, visualization and data-driven decision making.",
                    "It prepares students to transform data into useful information for organizations and technology applications.",
                    "Data science supports better decisions in healthcare, business, public services, research and many other fields.",
                    "Study involves mathematics, statistics, programming, databases, visualization and practical data projects.",
                    "Work may involve collecting, cleaning, analyzing and communicating insights from data.",
                    "Programming, statistics, mathematics, databases, analytical thinking and communication.",
                    "Opportunities continue to grow across analytics, data science, business intelligence and technology.",
                    "4 years",
                    "Typically 12th/Intermediate with the required subjects and admission requirements of the institution."
                ),

                new Course(
                    "B.Tech Electronics and Communication Engineering",
                    "An engineering program covering electronics, communication systems, digital systems, embedded technologies and related engineering fundamentals.",
                    "It provides a foundation for electronics, embedded systems, communication and hardware-oriented technology careers.",
                    "Electronics and communication technologies support telecommunications, transportation, healthcare, automation and consumer technology.",
                    "Study includes theory, electronics laboratories, circuit work, projects and practical engineering exercises.",
                    "Work may involve electronics design, embedded systems, telecommunications, testing and engineering support.",
                    "Electronics fundamentals, mathematics, problem solving, circuits, programming and technical communication.",
                    "Scope includes embedded systems, electronics, telecommunications, IoT and related technology fields.",
                    "4 years",
                    "Typically 12th/Intermediate with the required subjects and admission requirements of the institution."
                )
            );

            for (Course course : courses) {
                if (repository.findByName(course.getName()).isEmpty()) {
                    repository.save(course);
                    System.out.println(
                        "Added missing course: " + course.getName()
                    );
                } else {
                    System.out.println(
                        "Course already exists: " + course.getName()
                    );
                }
            }
        };
    }
}
