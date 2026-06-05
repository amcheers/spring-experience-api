package com.ahmad.experienceapi.service;

import com.ahmad.experienceapi.dto.CreateExperienceRequest;
import com.ahmad.experienceapi.entity.Experience;
import com.ahmad.experienceapi.exception.ExperienceNotFoundException;
import com.ahmad.experienceapi.repository.ExperienceRepository;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

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

    public Experience find(Long id) {
        return experienceRepository.findById(id)
                .orElseThrow(() -> new ExperienceNotFoundException(id));
    }

    public Experience create(CreateExperienceRequest request) {
        Experience experience = new Experience();

        experience.setTitle(request.title);
        experience.setDescription(request.description);
        experience.setPrice(request.price);
        experience.setLocationText(request.locationText);

        return experienceRepository.save(experience);
    }

    public Experience update(CreateExperienceRequest request, Long id) {
        Experience experience = find(id);

        experience.setTitle(request.title);
        experience.setDescription(request.description);
        experience.setPrice(request.price);
        experience.setLocationText(request.locationText);

        return experienceRepository.save(experience);
    }

    public void delete(Long id) {
        Experience experience = find(id);
        experienceRepository.delete(experience);
    }
}