package com.makemefly.controller;

import com.makemefly.dto.AirlineDTO;
import com.makemefly.entity.Airline;
import com.makemefly.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/makemyfly")
public class AirlineController {

    @Autowired
    AirlineService airlineService;

    @GetMapping()
    public String welcomeMessage(){
        return "Welcome to Make Me Fly ";
    }

    @PostMapping(value = "/addAirline")
    public Airline addAirline(@RequestBody AirlineDTO airline){
        return airlineService.addAirline(airline);
    }

    @GetMapping(value = "/getAirlines")
    public List<Airline> getAirlines (){
        return airlineService.getAirlines();
    }

}
