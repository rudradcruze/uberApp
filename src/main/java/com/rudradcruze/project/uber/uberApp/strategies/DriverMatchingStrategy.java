package com.rudradcruze.project.uber.uberApp.strategies;

import com.rudradcruze.project.uber.uberApp.entities.Driver;
import com.rudradcruze.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
