package com.rudradcruze.project.uber.uberApp.strategies.impl;

import com.rudradcruze.project.uber.uberApp.entities.RideRequest;
import com.rudradcruze.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSearchPricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
