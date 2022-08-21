package com.portfolio.fb.service;

import com.portfolio.fb.model.Skill;

import java.util.List;

public interface ISkillService {
    List<Skill> getSkills();

    Skill addSkill(Skill skill);

    Skill getSkillById(Long id);

    void deleteSkillById(Long id);

    Skill updateSkill(Skill skill);
}
