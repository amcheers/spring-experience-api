package com.ahmad.experienceapi.repository;

import com.ahmad.experienceapi.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}

