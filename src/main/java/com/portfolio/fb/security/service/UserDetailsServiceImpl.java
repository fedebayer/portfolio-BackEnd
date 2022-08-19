package com.portfolio.fb.security.service;

import com.portfolio.fb.security.model.Admin;
import com.portfolio.fb.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    IUserService iUserServ;
    @Autowired
    public UserDetailsServiceImpl(IUserService iUserServ){
        this.iUserServ = iUserServ;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = iUserServ.getUserByEmail(username).get();
        return Admin.build(user);
    }
}
