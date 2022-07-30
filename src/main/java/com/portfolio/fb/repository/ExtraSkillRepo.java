package com.portfolio.fb.repository;

import com.portfolio.fb.model.ExtraSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraSkillRepo extends JpaRepository<ExtraSkill,Long> {
}
