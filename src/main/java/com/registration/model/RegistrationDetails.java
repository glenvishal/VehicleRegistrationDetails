package com.registration.model;

import com.registration.persistence.dao.VehicleRegistrationDao;
import com.registration.persistence.entities.VehicleRegistration;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class RegistrationDetails {
    private List<VehicleRegistration> registrations;
}
