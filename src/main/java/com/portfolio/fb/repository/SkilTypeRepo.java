package com.portfolio.fb.repository;

import com.portfolio.fb.model.SkillType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkilTypeRepo extends JpaRepository<SkillType,Long> {
}
