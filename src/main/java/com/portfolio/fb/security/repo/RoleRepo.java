package com.portfolio.fb.security.repo;

import com.portfolio.fb.security.enums.RoleName;
import com.portfolio.fb.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    Optional<Role> findByName(RoleName roleName);
}
