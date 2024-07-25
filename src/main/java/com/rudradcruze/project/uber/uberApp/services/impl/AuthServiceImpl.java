package com.rudradcruze.project.uber.uberApp.services.impl;

import com.rudradcruze.project.uber.uberApp.dto.DriverDto;
import com.rudradcruze.project.uber.uberApp.dto.SignupDto;
import com.rudradcruze.project.uber.uberApp.dto.UserDto;
import com.rudradcruze.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignupDto signupDTO) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
