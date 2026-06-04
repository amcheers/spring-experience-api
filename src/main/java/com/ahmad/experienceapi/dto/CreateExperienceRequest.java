package com.ahmad.experienceapi.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateExperienceRequest {
    @NotBlank
    public String title;

    public String description;
    public String price;
    public String locationText;
}
