package com.registration.controller;

import com.registration.model.RegistrationDetails;
import com.registration.service.RegistrationDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
public class VehicleRegistrationController {
    private RegistrationDetailsService registrationDetailsService;

    public VehicleRegistrationController(RegistrationDetailsService registrationDetailsService) {
        this.registrationDetailsService = registrationDetailsService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<RegistrationDetails> getRegistrationDetails() {
        log.info("GET getRegistrationDetails");
        RegistrationDetails registrationDetails = registrationDetailsService.getRegistraionDetails();
        return new ResponseEntity<>(registrationDetails, HttpStatus.OK);
    }
}
