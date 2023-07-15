/*package com.portfolio.fb.util;

import com.portfolio.fb.security.enums.RoleName;
import com.portfolio.fb.security.model.Role;
import com.portfolio.fb.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {
    @Autowired
    RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        Role roleAdmin = new Role(RoleName.ROLE_ADMIN);
        Role roleUser = new Role(RoleName.ROLE_USER);
        roleService.addRole(roleAdmin);
        roleService.addRole(roleUser);
    }
}*/
