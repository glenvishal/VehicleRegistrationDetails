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
@Table(name = "registration")
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    private boolean expired;

    @Column(nullable = false, unique = true)
    private String expiry_date;

    public Registration(int id, boolean expired, String expiry_date) {
        this.id = id;
        this.expired = expired;
        this.expiry_date = expiry_date;
    }
}
