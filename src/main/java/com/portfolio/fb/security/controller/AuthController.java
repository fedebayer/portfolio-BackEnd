package com.portfolio.fb.security.controller;

import com.portfolio.fb.security.dto.JwtDto;
import com.portfolio.fb.security.dto.LoginUser;
import com.portfolio.fb.security.dto.Message;
import com.portfolio.fb.security.dto.NewUser;
import com.portfolio.fb.security.enums.RoleName;
import com.portfolio.fb.security.jwt.JwtProvider;
import com.portfolio.fb.security.model.Role;
import com.portfolio.fb.security.model.User;
import com.portfolio.fb.security.service.RoleService;
import com.portfolio.fb.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/add")
    public ResponseEntity<?> neww(@Valid @RequestBody NewUser newUser, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity(new Message("misplaced fields or invalid email"), HttpStatus.BAD_REQUEST);
        }
        if(userService.existsUserByEmail(newUser.getEmail())){
            return new ResponseEntity(new Message("the email is alredy taken"), HttpStatus.BAD_REQUEST);
        }
        User user = new User(newUser.getEmail(), passwordEncoder.encode(newUser.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleService.getRoleByName(RoleName.ROLE_USER).get());
        if(newUser.getRoles().contains("admin")){
            roles.add(roleService.getRoleByName(RoleName.ROLE_ADMIN).get());
        }
        user.setRoles(roles);
        userService.addUser(user);
        return new ResponseEntity(new Message("user saved"),HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUser loginUser, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity(new Message("misplaced fields or invalid email"), HttpStatus.BAD_REQUEST);
        }
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getEmail(),loginUser.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDto jwtDto = new JwtDto(jwt,userDetails.getUsername(),userDetails.getAuthorities());
        return new ResponseEntity(jwtDto,HttpStatus.OK);
    }
}
