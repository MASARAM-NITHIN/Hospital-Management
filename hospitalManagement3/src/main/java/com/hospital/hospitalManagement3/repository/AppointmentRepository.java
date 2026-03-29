package com.hospital.hospitalManagement3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospitalManagement3.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

 	
}
