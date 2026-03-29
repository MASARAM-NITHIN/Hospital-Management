package com.hospital.hospitalManagement3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospitalManagement3.entity.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
