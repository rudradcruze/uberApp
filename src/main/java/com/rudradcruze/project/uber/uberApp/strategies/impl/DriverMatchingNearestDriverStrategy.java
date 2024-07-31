package com.rudradcruze.project.uber.uberApp.strategies.impl;

import com.rudradcruze.project.uber.uberApp.entities.Driver;
import com.rudradcruze.project.uber.uberApp.entities.RideRequest;
import com.rudradcruze.project.uber.uberApp.repositories.DriverRepository;
import com.rudradcruze.project.uber.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
