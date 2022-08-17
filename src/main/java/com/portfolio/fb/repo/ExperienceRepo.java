package com.portfolio.fb.repo;

import com.portfolio.fb.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience,Long> {
}
