package com.makemefly.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FlightMealPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mealPreferenceId;
    private int mealId;
    private int flightId;
    private int isActive;
}
