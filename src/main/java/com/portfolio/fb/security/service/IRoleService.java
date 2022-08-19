package com.portfolio.fb.security.service;

import com.portfolio.fb.security.enums.RoleName;
import com.portfolio.fb.security.model.Role;

import java.util.Optional;

public interface IRoleService {
    Role addRole(Role role);

    Optional<Role> getRoleByName(RoleName roleName);
}
