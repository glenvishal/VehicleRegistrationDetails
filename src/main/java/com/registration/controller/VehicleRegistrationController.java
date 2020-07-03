package com.registration.controller;

import com.registration.persistence.dao.VehicleRegistrationDao;
import com.registration.persistence.entities.Vehicle;
import com.registration.persistence.entities.VehicleRegistration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
public class VehicleRegistrationController {
    private VehicleRegistrationDao vehicleRegistrationDao;

    public VehicleRegistrationController(VehicleRegistrationDao vehicleRegistrationDao) {
        this.vehicleRegistrationDao = vehicleRegistrationDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<VehicleRegistration>> getVehicleRegistrationRecord() {
        List<VehicleRegistration> vehicles= vehicleRegistrationDao.findAll();

        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }
}
