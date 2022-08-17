package com.portfolio.fb.security.service;

import com.portfolio.fb.security.model.User;

import java.util.Optional;

public interface IUserService {
    User addUser(User user);
    Optional<User> getUserByEmail(String email);
    boolean existsUserByEmail(String email);
}
