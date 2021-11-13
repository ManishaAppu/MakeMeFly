package com.makemefly.controller;

import com.makemefly.dto.AvailableFlightsDTO;
import com.makemefly.dto.FlightSearchDTO;
import com.makemefly.dto.TicketBookingDTO;
import com.makemefly.entity.TicketBookingDetails;
import com.makemefly.service.TicketReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/makemyfly")
public class TicketReservationController {

    @Autowired
    TicketReservationService ticketReservationService;

    @PostMapping("/bookTicket")
    public TicketBookingDetails bookFlightTicket(@RequestBody TicketBookingDTO ticketBookingDTO){
        return ticketReservationService.bookFlightTicket(ticketBookingDTO);
    }

    @GetMapping("/getAllTickets")
    public List<TicketBookingDetails> getAllTicketsBooked(){
        return ticketReservationService.getAllTicketsBooked();
    }

    @GetMapping("/getTicket/{ticketId}")
    public TicketBookingDetails getTicketByTicketBookingId(@PathVariable int ticketId){
        return ticketReservationService.getTicketsByTicketId(ticketId);
    }

    @GetMapping("/searchFlight")
    public List<AvailableFlightsDTO> getAvailableFlights(@RequestBody FlightSearchDTO flightSearchDTO) {
        return ticketReservationService.getAvailableFlights(flightSearchDTO);
    }
}
