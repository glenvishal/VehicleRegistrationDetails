package com.registration.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class Registration implements Serializable {
    private boolean expired;
    private String expiry_date;
}
