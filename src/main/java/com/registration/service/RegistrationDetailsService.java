package com.registration.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.registration.controller.VehicleRegistrationController;
import com.registration.model.RegistrationDetails;
import com.registration.persistence.dao.VehicleRegistrationDao;
import com.registration.persistence.entities.Registration;
import com.registration.persistence.entities.VehicleRegistration;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RegistrationDetailsService {
    private VehicleRegistrationDao vehicleRegistrationDao;
    private RegistrationDetails registrationDetails;

    public RegistrationDetailsService(VehicleRegistrationDao vehicleRegistrationDao, RegistrationDetails registrationDetails) {
        this.vehicleRegistrationDao = vehicleRegistrationDao;
        this.registrationDetails = registrationDetails;
    }

    public RegistrationDetails getRegistraionDetails() {
        log.info("getRegistraionDetails");
        registrationDetails.setRegistrations(vehicleRegistrationDao.findAll());
        return registrationDetails;
    }

}
