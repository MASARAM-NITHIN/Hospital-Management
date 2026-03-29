package com.hospital.hospitalManagement3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospitalManagement3.entity.Patient;


public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
