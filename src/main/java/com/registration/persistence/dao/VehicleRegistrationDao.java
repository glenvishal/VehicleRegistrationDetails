package com.registration.persistence.dao;

import com.registration.persistence.entities.VehicleRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRegistrationDao extends JpaRepository<VehicleRegistration, Integer> {
}
