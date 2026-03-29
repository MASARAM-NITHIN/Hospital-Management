package com.hospital.hospitalManagement3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospitalManagement3.entity.Appointment;
import com.hospital.hospitalManagement3.entity.Doctor;
import com.hospital.hospitalManagement3.entity.Patient;
import com.hospital.hospitalManagement3.repository.AppointmentRepository;
import com.hospital.hospitalManagement3.repository.DoctorRepository;
import com.hospital.hospitalManagement3.repository.PatientRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    // ✅ FIXED SAVE METHOD
    public void save(Appointment a) {

        Doctor d = doctorRepository
                .findById(a.getDoctor().getDoctorId())
                .orElse(null);

        Patient p = patientRepository
                .findById(a.getPatient().getPatientId())
                .orElse(null);

        a.setDoctor(d);
        a.setPatient(p);

        appointmentRepository.save(a);
    }

    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    // ✅ FIX DELETE ALSO
    public void delete(int id) {
        appointmentRepository.deleteById(id);
    }

	

	public void deleteByDoctorId(int id) {
		// TODO Auto-generated method stub
		
	}
}