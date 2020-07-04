package com.registration.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.registration.model.RegistrationDetails;
import com.registration.persistence.dao.VehicleRegistrationDao;
import com.registration.persistence.entities.Registration;
import com.registration.persistence.entities.VehicleRegistration;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationDetailsService {
    private VehicleRegistrationDao vehicleRegistrationDao;
    private RegistrationDetails registrationDetails;

    public RegistrationDetailsService(VehicleRegistrationDao vehicleRegistrationDao, RegistrationDetails registrationDetails) {
        this.vehicleRegistrationDao = vehicleRegistrationDao;
        this.registrationDetails = registrationDetails;
    }

    public RegistrationDetails getRegistraionDetails() {
        registrationDetails.setRegistrations(vehicleRegistrationDao.findAll());
        return registrationDetails;
    }

}
