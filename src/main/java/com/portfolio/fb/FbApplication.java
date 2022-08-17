package com.portfolio.fb;

import com.portfolio.fb.security.model.Role;
import com.portfolio.fb.security.model.User;
import com.portfolio.fb.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class FbApplication {

	public static void main(String[] args) {
		SpringApplication.run(FbApplication.class, args);
	}


}
