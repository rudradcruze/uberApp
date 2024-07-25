package com.rudradcruze.project.uber.uberApp.services;

import com.rudradcruze.project.uber.uberApp.dto.DriverDto;
import com.rudradcruze.project.uber.uberApp.dto.SignupDto;
import com.rudradcruze.project.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signUp(SignupDto signupDTO);

    DriverDto onBoardNewDriver(Long userId);
}
