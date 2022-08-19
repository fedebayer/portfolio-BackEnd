package com.portfolio.fb.service;

import com.portfolio.fb.model.Skill;
import com.portfolio.fb.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillService implements ISkillService{
    private final SkillRepo skillRepo;
    @Autowired
    public SkillService(SkillRepo skillRepo){
        this.skillRepo = skillRepo;
    }
    @Override
    public List<Skill> getAllSkills() {
        return skillRepo.findAll();
    }

    @Override
    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public Skill getSkillById(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    @Override
    public void deleteSkillById(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill updateSkill(Skill skill) {
        return skillRepo.save(skill);
    }

}
