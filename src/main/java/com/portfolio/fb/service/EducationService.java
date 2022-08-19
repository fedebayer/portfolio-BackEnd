package com.portfolio.fb.service;

import com.portfolio.fb.model.Education;
import com.portfolio.fb.repo.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService implements IEducationService{
    private final EducationRepo eduRepo;
    @Autowired
    public EducationService(EducationRepo eduRepo){
        this.eduRepo = eduRepo;
    }

    @Override
    public List<Education> getAllEducations() {
        return eduRepo.findAll();
    }

    @Override
    public Education addEducation(Education edu) {
        return eduRepo.save(edu);
    }

    @Override
    public Education getEducationById(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteEducationById(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Education updateEducation(Education edu) {
        return eduRepo.save(edu);
    }
}
