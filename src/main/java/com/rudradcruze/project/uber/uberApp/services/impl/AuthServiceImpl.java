package com.rudradcruze.project.uber.uberApp.services.impl;

import com.rudradcruze.project.uber.uberApp.dto.DriverDto;
import com.rudradcruze.project.uber.uberApp.dto.SignupDto;
import com.rudradcruze.project.uber.uberApp.dto.UserDto;
import com.rudradcruze.project.uber.uberApp.entities.User;
import com.rudradcruze.project.uber.uberApp.entities.enums.Role;
import com.rudradcruze.project.uber.uberApp.exceptions.RuntimeConflictException;
import com.rudradcruze.project.uber.uberApp.repositories.UserRepository;
import com.rudradcruze.project.uber.uberApp.services.AuthService;
import com.rudradcruze.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignupDto signupDto) {

        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if (user != null)
            throw new RuntimeConflictException("Cannot signup, User already exists with email " + signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

//        create user related entities
        riderService.createNewRider(savedUser);
//        TODO add wallet related service here

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
