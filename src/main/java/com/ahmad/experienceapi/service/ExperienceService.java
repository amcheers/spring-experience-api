package com.ahmad.experienceapi.service;

import com.ahmad.experienceapi.dto.CreateExperienceRequest;
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

    public Experience create(CreateExperienceRequest request) {
        Experience experience = new Experience();

        experience.setTitle(request.title);
        experience.setDescription(request.description);
        experience.setPrice(request.price);
        experience.setLocationText(request.locationText);

        return experienceRepository.save(experience);
    }
}