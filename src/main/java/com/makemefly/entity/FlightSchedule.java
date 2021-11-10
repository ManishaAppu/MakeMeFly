package com.makemefly.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FlightSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightScheduleId;
    private int flightId;
    private int sourcePlaceId;
    private int destinationPlaceId;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int scheduleDaysId;
    private LocalDateTime scheduledStartDate;
    private LocalDateTime scheduledEndDate;

}
