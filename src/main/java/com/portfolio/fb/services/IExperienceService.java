package com.portfolio.fb.services;

import com.portfolio.fb.model.Experience;

import java.util.List;

public interface IExperienceService {
    List<Experience> getAllExperiences();

    Experience addExperience(Experience exp);

    Experience getExperienceById(Long id);

    void deleteExperienceById(Long id);

    Experience updateExperience(Experience exp);
}
