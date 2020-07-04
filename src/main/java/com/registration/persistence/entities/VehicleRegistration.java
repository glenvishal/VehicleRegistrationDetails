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
@Table(name = "VehicleRegistration")
public class VehicleRegistration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    private String plate_number;

    @ManyToOne
    @JoinColumn(name = "expiry_date", referencedColumnName = "expiry_date")
    private Registration registration;

    @ManyToOne
    @JoinColumn(name = "vin", referencedColumnName = "vin")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "insurer_code", referencedColumnName = "code")
    private Insurer insurer;
}
