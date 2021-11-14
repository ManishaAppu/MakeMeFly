package com.makemefly.service;

import com.makemefly.dto.AirlineDTO;
import com.makemefly.entity.Airline;
import com.makemefly.mapper.AirlineMapper;
import com.makemefly.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {

    @Autowired
    AirlineRepository airlineRepository;

    @Autowired
    AirlineMapper airlineMapper;

    public Airline addAirline(AirlineDTO a){
        /*Airline airline = new Airline();
        airline.setAirlineName(a.getAirlineName());
        airline.setIaia(a.getIaia());
        airline.setIsActive(a.getIsActive());*/
        return airlineRepository.save(airlineMapper.mapToAirline(a));
    }

    public List<Airline> getAirlines(){
        return airlineRepository.getAllAirlines();
    }

    public int deleteAirline(int airlineId){
        return airlineRepository.deleteAirline(airlineId);
    }


}
