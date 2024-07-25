package com.rudradcruze.project.uber.uberApp.strategies;

import com.rudradcruze.project.uber.uberApp.dto.RideRequestDto;
public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto, double time);
}
