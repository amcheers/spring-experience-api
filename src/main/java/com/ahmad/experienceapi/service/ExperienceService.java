package com.ahmad.experienceapi.service;

import com.ahmad.experienceapi.entity.Experience;
import com.ahmad.experienceapi.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceService(
            ExperienceRepository experienceRepository
    ) {
        this.experienceRepository = experienceRepository;
    }

    public List<Experience> findAll() {
        return experienceRepository.findAll();
    }
}