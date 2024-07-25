package com.rudradcruze.project.uber.uberApp.services;

import com.rudradcruze.project.uber.uberApp.dto.DriverDto;
import com.rudradcruze.project.uber.uberApp.dto.RideDto;
import com.rudradcruze.project.uber.uberApp.dto.RideRequestDto;
import com.rudradcruze.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
