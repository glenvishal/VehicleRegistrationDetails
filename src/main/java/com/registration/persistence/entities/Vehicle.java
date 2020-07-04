package com.registration.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "vehicle")
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    private String type;
    private String make;
    private String model;
    private String colour;

    @Column(nullable = false, unique = true)
    private String vin;

    private Integer tare_weight;
    private Integer gross_mass;

    public Vehicle(int id, String type, String make, String model, String colour, String vin, Integer tare_weight, Integer gross_mass) {
        this.id = id;
        this.type = type;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.vin = vin;
        this.tare_weight = tare_weight;
        this.gross_mass = gross_mass;
    }
}
