package com.makemefly.service;

import com.makemefly.entity.Flight;
import com.makemefly.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public Flight addFlight(Flight flight){
        return flightRepository.save(flight);
    }
}
