package com.portfolio.fb.service;

import com.portfolio.fb.model.Experience;
import com.portfolio.fb.repo.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienceService implements IExperienceService{

    private final ExperienceRepo expRepo;
    @Autowired
    public ExperienceService(ExperienceRepo expRepo){
        this.expRepo = expRepo;
    }

    @Override
    public List<Experience> getExperiences() {
        return expRepo.findAll();
    }

    @Override
    public Experience addExperience(Experience exp) {
        return expRepo.save(exp);
    }

    @Override
    public Experience getExperienceById(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteExperienceById(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience updateExperience(Experience exp) {
        return expRepo.save(exp);
    }
}
