package com.makemefly.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(value = "flightSchedules")
public class Flight {

    public Flight(int flightId) {
        this.flightId = flightId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;
    private String flightName;
    private int businessSeats;
    private int nonBusinessSeats;
    private double businessSeatCost;
    private double nonBusinessSeatCost;
    private int isActive;
  /*  @OneToMany(fetch = FetchType.EAGER)
    private List<FlightMealPreference> mealPreferences;*/

    @OneToOne
    @JoinColumn(name = "fk_airlineId", referencedColumnName = "airlineId")
  //  @JsonManagedReference
    private Airline airline;

  /*  @OneToMany//(targetEntity = Meal.class, cascade =CascadeType.ALL)
   *//*@JoinTable(
            name = "flight_meal_preference",
            joinColumns = @JoinColumn(name = "fk_meal_id",  referencedColumnName = "meal_id"),
            inverseJoinColumns = @JoinColumn(name="fk_flight_id", referencedColumnName = "flight_id")
    )*//*
    private List<Meal> meal;*/

  /* @OneToMany( mappedBy = "flight", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
   //@JoinColumn(name="fk_flight_meal_preference", referencedColumnName = "flightId")
   private Set<FlightMealPreference> flightMealPreferenceList;*/

    @ManyToMany
    private List<Meal> meals;

    @OneToMany
    @JoinColumn(name="flightId")
    private List<FlightSchedule> flightSchedules;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="flightId")
    private List<FlightSeats> flightSeats;
}
