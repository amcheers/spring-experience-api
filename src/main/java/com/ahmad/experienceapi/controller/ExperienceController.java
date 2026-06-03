package com.ahmad.experienceapi.controller;

import com.ahmad.experienceapi.entity.Experience;
import com.ahmad.experienceapi.service.ExperienceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiences")
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(
            ExperienceService experienceService
    ) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public List<Experience> index() {
        return experienceService.findAll();
    }
}