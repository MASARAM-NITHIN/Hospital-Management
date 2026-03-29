package com.hospital.hospitalManagement3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.hospitalManagement3.entity.Patient;
import com.hospital.hospitalManagement3.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    public void save(Patient p) {
        patientRepository.save(p);
    }

    @Transactional
    public void delete(int id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        
        // If appointments are mapped with cascade = ALL, they will be removed automatically
        patientRepository.delete(patient);
    }
}