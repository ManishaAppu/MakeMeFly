package com.makemefly.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FlightSeats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightSeatId;
    private String flightSeatNumber;
    private int flightId;
    private int isBusinessSeat;

}
