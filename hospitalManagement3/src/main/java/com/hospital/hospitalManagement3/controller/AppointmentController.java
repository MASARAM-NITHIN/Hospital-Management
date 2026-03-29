package com.hospital.hospitalManagement3.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.hospitalManagement3.entity.Appointment;
import com.hospital.hospitalManagement3.service.AppointmentService;
import com.hospital.hospitalManagement3.service.DoctorService;
import com.hospital.hospitalManagement3.service.PatientService;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private PatientService patientService;
	
	@GetMapping
    public String view(Model model) {
        model.addAttribute("appointments", appointmentService.getAll());
        model.addAttribute("patients", patientService.getAll());
        model.addAttribute("doctors", doctorService.getAll());
        return "appointments.html";
    }

    @PostMapping("/add")
    public String add(Appointment a) {
        appointmentService.save(a);
        return "appointments.html";
    }
    
    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
    	appointmentService.delete(id);
    	return "appointments.html";
    }
    
	
	
}

