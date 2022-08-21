package com.portfolio.fb.service;

import com.portfolio.fb.model.SoftSkill;

import java.util.List;

public interface ISoftSkillService {
    List<SoftSkill> getSoftSkills();

    SoftSkill addSoftSkill(SoftSkill soft);

    SoftSkill getSoftSkillById(Long id);

    void deleteSoftSkillById(Long id);

    SoftSkill updateSoftSkill(SoftSkill soft);
}
