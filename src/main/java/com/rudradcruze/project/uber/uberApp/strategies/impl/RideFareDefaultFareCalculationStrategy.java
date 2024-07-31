package com.rudradcruze.project.uber.uberApp.strategies.impl;

import com.rudradcruze.project.uber.uberApp.dto.RideRequestDto;
import com.rudradcruze.project.uber.uberApp.entities.RideRequest;
import com.rudradcruze.project.uber.uberApp.services.DistanceService;
import com.rudradcruze.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        Double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(), rideRequest.getDropOffLocation());
        // TODO: Called the third party api called OSRM to fetch the distance
        return distance*RIDE_FARE_MULTIPLIER;
    }
}
