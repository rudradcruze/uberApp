package com.rudradcruze.project.uber.uberApp.strategies.impl;

import com.rudradcruze.project.uber.uberApp.dto.RideRequestDto;
import com.rudradcruze.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareSearchPricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto, double time) {
        return 0;
    }
}
