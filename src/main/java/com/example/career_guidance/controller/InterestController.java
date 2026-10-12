package com.example.career_guidance.controller;

import com.example.career_guidance.entity.Interest;
import com.example.career_guidance.repository.InterestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/interests")
public class InterestController {

    private final InterestRepository interestRepository;

    public InterestController(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    @GetMapping
    public List<Interest> getAllInterests() {
        return interestRepository.findAll();
    }
}
