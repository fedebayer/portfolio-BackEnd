package com.portfolio.fb.services;

import com.portfolio.fb.model.SoftSkill;
import com.portfolio.fb.repository.SoftSkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SoftSkillService implements ISoftSkillService{
    private final SoftSkillRepo softRepo;
    @Autowired
    public SoftSkillService(SoftSkillRepo softRepo){
        this.softRepo = softRepo;
    }
    @Override
    public List<SoftSkill> getAllSoftSkills() {
        return softRepo.findAll();
    }

    @Override
    public SoftSkill addSoftSkill(SoftSkill soft) {
        return softRepo.save(soft);
    }

    @Override
    public SoftSkill getSoftSkillById(Long id) {
        return softRepo.findById(id).orElse(null);
    }
    @Override
    public void deleteSoftSkillById(Long id) {
        softRepo.deleteById(id);
    }

    @Override
    public SoftSkill updateSoftSkill(SoftSkill soft) {
        return softRepo.save(soft);
    }

}
