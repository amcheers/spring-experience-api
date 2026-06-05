package com.ahmad.experienceapi.exception;

public class ExperienceNotFoundException extends RuntimeException {
    public ExperienceNotFoundException(Long id) {
        super("Experience not found with id: " + id);
    }
}
