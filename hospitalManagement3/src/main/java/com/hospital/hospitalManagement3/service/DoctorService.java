package com.hospital.hospitalManagement3.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospitalManagement3.entity.Doctor;
import com.hospital.hospitalManagement3.repository.DoctorRepository;


@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public void save(Doctor d) {
        doctorRepository.save(d);
    }

    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    public void deleteById(int id) {
        doctorRepository.deleteById(id);
    }
}
