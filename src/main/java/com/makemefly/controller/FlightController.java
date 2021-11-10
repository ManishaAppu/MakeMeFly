package com.makemefly.controller;

import com.makemefly.entity.Flight;
import com.makemefly.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/makemyfly")
public class FlightController {
    @Autowired
    FlightService flightService;

    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight){
        return flightService.addFlight(flight);
    }



}
