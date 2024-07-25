package com.rudradcruze.project.uber.uberApp.strategies;

import com.rudradcruze.project.uber.uberApp.dto.RideRequestDto;
import com.rudradcruze.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
