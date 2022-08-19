package com.portfolio.fb.security.service;

import com.portfolio.fb.security.model.User;
import com.portfolio.fb.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserService implements IUserService{
    private final UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo){this.userRepo = userRepo;}


    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public boolean existsUserByEmail(String email) {
        return userRepo.existsByEmail(email);
    }

}
