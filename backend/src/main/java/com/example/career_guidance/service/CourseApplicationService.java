package com.example.career_guidance.service;

import com.example.career_guidance.dto.CourseApplicationRequest;
import com.example.career_guidance.entity.Course;
import com.example.career_guidance.entity.CourseApplication;
import com.example.career_guidance.entity.Student;
import com.example.career_guidance.repository.CourseApplicationRepository;
import com.example.career_guidance.repository.CourseRepository;
import com.example.career_guidance.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseApplicationService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final CourseApplicationRepository courseApplicationRepository;

    public CourseApplicationService(
            StudentRepository studentRepository,
            CourseRepository courseRepository,
            CourseApplicationRepository courseApplicationRepository) {

        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.courseApplicationRepository = courseApplicationRepository;
    }

    public CourseApplication apply(CourseApplicationRequest request) {

        Student student = studentRepository.findByEmail(request.getEmail())
                .orElseGet(() -> studentRepository.save(
                        new Student(
                                request.getFullName(),
                                request.getEmail(),
                                request.getPhone(),
                                request.getQualification(),
                                request.getInstitution(),
                                "REGISTERED"
                        )
                ));

        Course course = courseRepository.findById(request.getCourseId())
                .orElseThrow(() -> new RuntimeException("Course not found"));

        CourseApplication application = new CourseApplication(
                student,
                course,
                "SUBMITTED",
                LocalDateTime.now()
        );

        return courseApplicationRepository.save(application);
    }

    public List<CourseApplication> getApplicationsByStudent(Long studentId) {
        return courseApplicationRepository
                .findByStudentIdOrderByAppliedAtDesc(studentId);
    }
}