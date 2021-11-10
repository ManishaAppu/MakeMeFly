package com.makemefly.service;

import com.makemefly.entity.Airline;
import com.makemefly.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {

    @Autowired
    AirlineRepository airlineRepository;

    public Airline addAirline(Airline a){
        return airlineRepository.save(a);
    }

    public List<Airline> getAirlines(){
        return airlineRepository.findAll();
    }


}
