package com.portfolio.fb.security.service;

import com.portfolio.fb.security.enums.RoleName;
import com.portfolio.fb.security.model.Role;
import com.portfolio.fb.security.repo.RoleRepo;
import com.portfolio.fb.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RoleService implements IRoleService{
    private final RoleRepo roleRepo;
    @Autowired
    public RoleService(RoleRepo roleRepo){this.roleRepo = roleRepo;}
    @Override
    public Role addRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public Optional<Role> getRoleByName(RoleName roleName) {
        return roleRepo.findByName(roleName);
    }
}
