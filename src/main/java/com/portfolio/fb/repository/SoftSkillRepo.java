package com.portfolio.fb.repository;

import com.portfolio.fb.model.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepo extends JpaRepository<SoftSkill,Long> {
}
