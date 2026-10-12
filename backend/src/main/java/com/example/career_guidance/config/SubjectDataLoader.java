package com.example.career_guidance.config;

import com.example.career_guidance.entity.Course;
import com.example.career_guidance.entity.Subject;
import com.example.career_guidance.repository.CourseRepository;
import com.example.career_guidance.repository.SubjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubjectDataLoader {

    @Bean
    CommandLineRunner loadSubjects(
            CourseRepository courseRepository,
            SubjectRepository subjectRepository) {

        return args -> {

            if (subjectRepository.count() > 0) {
                return;
            }

            Course cse = courseRepository.findAll()
                    .stream()
                    .filter(course -> course.getName()
                            .equals("B.Tech Computer Science and Engineering"))
                    .findFirst()
                    .orElse(null);

            if (cse == null) {
                return;
            }

            // Semester 1
            add(subjectRepository, cse, 1, 1,
                    "Engineering Mathematics I",
                    "Fundamentals of calculus, algebra and mathematical problem solving.");

            add(subjectRepository, cse, 1, 1,
                    "Programming in C",
                    "Programming fundamentals, control structures, functions, arrays and pointers.");

            add(subjectRepository, cse, 1, 1,
                    "Engineering Physics",
                    "Fundamental physics concepts relevant to engineering and technology.");

            add(subjectRepository, cse, 1, 1,
                    "Engineering Chemistry",
                    "Basic chemistry concepts and their applications in engineering.");

            add(subjectRepository, cse, 1, 1,
                    "Computer Fundamentals",
                    "Introduction to computer hardware, software, operating systems and digital systems.");

            add(subjectRepository, cse, 1, 1,
                    "Programming Laboratory",
                    "Practical programming exercises and problem solving.");

            // Semester 2
            add(subjectRepository, cse, 1, 2,
                    "Engineering Mathematics II",
                    "Advanced mathematics, differential equations and mathematical applications.");

            add(subjectRepository, cse, 1, 2,
                    "Object-Oriented Programming",
                    "Classes, objects, inheritance, polymorphism, abstraction and encapsulation.");

            add(subjectRepository, cse, 1, 2,
                    "Digital Logic Design",
                    "Boolean algebra, logic gates, combinational and sequential circuits.");

            add(subjectRepository, cse, 1, 2,
                    "Communication Skills",
                    "Technical communication, presentations, writing and professional communication.");

            add(subjectRepository, cse, 1, 2,
                    "Data Structures Introduction",
                    "Arrays, linked lists, stacks, queues and basic algorithmic thinking.");

            add(subjectRepository, cse, 1, 2,
                    "Object-Oriented Programming Laboratory",
                    "Practical programming using object-oriented concepts.");

            // Semester 3
            add(subjectRepository, cse, 2, 3,
                    "Data Structures and Algorithms",
                    "Trees, graphs, hashing, sorting, searching and algorithm analysis.");

            add(subjectRepository, cse, 2, 3,
                    "Database Management Systems",
                    "Relational databases, SQL, normalization, transactions and database design.");

            add(subjectRepository, cse, 2, 3,
                    "Computer Organization",
                    "CPU architecture, memory, instruction processing and computer organization.");

            add(subjectRepository, cse, 2, 3,
                    "Discrete Mathematics",
                    "Logic, sets, relations, graphs, combinatorics and mathematical reasoning.");

            add(subjectRepository, cse, 2, 3,
                    "Operating Systems",
                    "Processes, threads, memory management, file systems and scheduling.");

            add(subjectRepository, cse, 2, 3,
                    "Data Structures Laboratory",
                    "Implementation and practical analysis of data structures and algorithms.");

            // Semester 4
            add(subjectRepository, cse, 2, 4,
                    "Computer Networks",
                    "Network models, protocols, routing, TCP/IP and network security fundamentals.");

            add(subjectRepository, cse, 2, 4,
                    "Software Engineering",
                    "Software development life cycle, requirements, design, testing and maintenance.");

            add(subjectRepository, cse, 2, 4,
                    "Web Technologies",
                    "HTML, CSS, JavaScript, web architecture and client-server applications.");

            add(subjectRepository, cse, 2, 4,
                    "Database Applications",
                    "Advanced SQL, database programming and practical database applications.");

            add(subjectRepository, cse, 2, 4,
                    "Probability and Statistics",
                    "Probability, statistical analysis and applications in computing.");

            add(subjectRepository, cse, 2, 4,
                    "Web Development Laboratory",
                    "Practical development of responsive and database-driven web applications.");

            // Semester 5
            add(subjectRepository, cse, 3, 5,
                    "Java Programming",
                    "Core Java, collections, exception handling, multithreading and application development.");

            add(subjectRepository, cse, 3, 5,
                    "Artificial Intelligence",
                    "Search, knowledge representation, reasoning and fundamentals of intelligent systems.");

            add(subjectRepository, cse, 3, 5,
                    "Computer Security",
                    "Security principles, authentication, encryption and secure computing fundamentals.");

            add(subjectRepository, cse, 3, 5,
                    "Cloud Computing",
                    "Cloud architecture, virtualization, services and cloud deployment concepts.");

            add(subjectRepository, cse, 3, 5,
                    "Professional Elective I",
                    "An elective allowing students to explore an area aligned with their career interests.");

            add(subjectRepository, cse, 3, 5,
                    "Java Programming Laboratory",
                    "Practical Java application development and problem solving.");

            // Semester 6
            add(subjectRepository, cse, 3, 6,
                    "Machine Learning",
                    "Supervised learning, unsupervised learning, model evaluation and practical ML concepts.");

            add(subjectRepository, cse, 3, 6,
                    "Distributed Systems",
                    "Distributed computing, communication, coordination and distributed architectures.");

            add(subjectRepository, cse, 3, 6,
                    "DevOps Fundamentals",
                    "Version control, continuous integration, deployment and software delivery practices.");

            add(subjectRepository, cse, 3, 6,
                    "Mobile Application Development",
                    "Fundamentals of designing and developing mobile applications.");

            add(subjectRepository, cse, 3, 6,
                    "Professional Elective II",
                    "Advanced elective selected according to student interests and career goals.");

            add(subjectRepository, cse, 3, 6,
                    "Mini Project",
                    "A practical software project applying concepts learned during the program.");

            // Semester 7
            add(subjectRepository, cse, 4, 7,
                    "Advanced Artificial Intelligence",
                    "Advanced AI concepts and applications in modern intelligent systems.");

            add(subjectRepository, cse, 4, 7,
                    "Cybersecurity",
                    "Application security, network security, ethical security practices and threat management.");

            add(subjectRepository, cse, 4, 7,
                    "Big Data Analytics",
                    "Large-scale data processing, analytics and distributed data technologies.");

            add(subjectRepository, cse, 4, 7,
                    "Professional Elective III",
                    "Advanced technical elective aligned with career specialization.");

            add(subjectRepository, cse, 4, 7,
                    "Project Management",
                    "Planning, execution, teamwork, risk management and delivery of technology projects.");

            add(subjectRepository, cse, 4, 7,
                    "Internship",
                    "Industry exposure through supervised practical work and professional experience.");

            // Semester 8
            add(subjectRepository, cse, 4, 8,
                    "Major Project",
                    "A comprehensive software or technology project demonstrating technical and problem-solving skills.");

            add(subjectRepository, cse, 4, 8,
                    "Professional Elective IV",
                    "Final advanced elective selected according to career interests.");

            add(subjectRepository, cse, 4, 8,
                    "Entrepreneurship and Innovation",
                    "Innovation, startup fundamentals, business models and technology entrepreneurship.");

            add(subjectRepository, cse, 4, 8,
                    "Technical Seminar",
                    "Research, technical presentation and communication of an emerging technology topic.");

            add(subjectRepository, cse, 4, 8,
                    "Career Development",
                    "Resume preparation, interviews, professional skills and career planning.");
        };
    }

    private void add(
            SubjectRepository repository,
            Course course,
            int year,
            int semester,
            String name,
            String description) {

        repository.save(
                new Subject(
                        course,
                        year,
                        semester,
                        name,
                        description
                )
        );
    }
}
