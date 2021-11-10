package com.makemefly.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;
    private String flightName;
    private int airlineId;
    private int businessSeats;
    private int nonBusinessSeats;
    private double businessSeatCost;
    private double nonBusinessSeatCost;
    private int isActive;
    @OneToMany
    private List<Meal> mealPreferences;
}
