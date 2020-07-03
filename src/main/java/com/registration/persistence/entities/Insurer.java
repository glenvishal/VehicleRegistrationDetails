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
@Table(name = "insurer")
public class Insurer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    private String name;

    @Column(nullable = false, unique = true)
    private int code;

    public Insurer(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

}
