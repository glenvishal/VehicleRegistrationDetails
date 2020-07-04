package com.registration.persistent.dao;

import com.registration.persistence.dao.VehicleRegistrationDao;
import com.registration.persistence.entities.VehicleRegistration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class VehicleRegistrationDaoTest {
    @Autowired
    private VehicleRegistrationDao vehicleRegistrationDao;

    List<String> plateNumbers = Arrays.asList("EBF28E", "CXD82F", "WOP29P", "QWX55Z");
    List<String> expiryDates = Arrays.asList("2021-02-05T23:15:30.000Z", "2020-03-01T23:15:30.000Z", "2020-12-08T23:15:30.000Z", "2021-07-20T23:15:30.000Z");
    List<String> vins = Arrays.asList("12389347324", "54646546313", "87676676762", "65465466541");
    List<String> codes = Arrays.asList("32", "17", "13", "27");

    @Test
    public void testDataSize(){
        assertThat(vehicleRegistrationDao.findAll().size()).isEqualTo(4);
    }

    @Test
    public void testVehicleRegistrationPlateNumber(){
        List<VehicleRegistration> vehicleRegistrationList = vehicleRegistrationDao.findAll();
        vehicleRegistrationList.forEach( v -> {
            assertThat(plateNumbers.contains(v.getPlate_number())).isTrue();
        });
    }

    @Test
    public void testVehicleRegistrationExpiryDate(){
        List<VehicleRegistration> vehicleRegistrationList = vehicleRegistrationDao.findAll();
        vehicleRegistrationList.forEach( v -> {
            assertThat(expiryDates.contains(v.getRegistration().getExpiry_date())).isTrue();
        });
    }

    @Test
    public void testVehicleRegistrationVin(){
        List<VehicleRegistration> vehicleRegistrationList = vehicleRegistrationDao.findAll();
        vehicleRegistrationList.forEach( v -> {
            assertThat(vins.contains(v.getVehicle().getVin())).isTrue();
        });
    }

    @Test
    public void testVehicleRegistrationInsurerCode(){
        List<VehicleRegistration> vehicleRegistrationList = vehicleRegistrationDao.findAll();
        vehicleRegistrationList.forEach( v -> {
            assertThat(codes.contains(Integer.toString(v.getInsurer().getCode()))).isTrue();
        });
    }
}
