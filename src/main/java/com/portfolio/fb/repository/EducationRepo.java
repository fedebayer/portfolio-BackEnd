package com.portfolio.fb.repository;

import com.portfolio.fb.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<Education,Long> {
}
