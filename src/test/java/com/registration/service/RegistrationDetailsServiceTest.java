package com.registration.service;

import com.registration.model.RegistrationDetails;
import com.registration.persistence.dao.VehicleRegistrationDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RegistrationDetailsServiceTest {
    @Autowired
    private RegistrationDetailsService registrationDetailsService;

    @Autowired
    private VehicleRegistrationDao vehicleRegistrationDao;

    @Test
    public void testGetRegistraionDetails() {
        RegistrationDetails registrationDetails = registrationDetailsService.getRegistraionDetails();
        assertThat(registrationDetails.getRegistrations().size()).isEqualTo(vehicleRegistrationDao.findAll().size());
    }
}
