package com.registration.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.registration.model.Registration;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "VehicleRegistration")
public class VehicleRegistration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    private String plate_number;

    @JsonIgnore
    private boolean expired;
    @JsonIgnore
    private String expiry_date;

    @Transient
    private Registration registration;

    @ManyToOne
    @JoinColumn(name = "vin", referencedColumnName = "vin")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "insurer_code", referencedColumnName = "code")
    private Insurer insurer;

    public Registration getRegistration() {
        this.registration = new Registration();
        this.registration.setExpired(this.expired);
        this.registration.setExpiry_date(this.expiry_date);
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.expired = registration.isExpired();
        this.expiry_date = registration.getExpiry_date();
    }
}
