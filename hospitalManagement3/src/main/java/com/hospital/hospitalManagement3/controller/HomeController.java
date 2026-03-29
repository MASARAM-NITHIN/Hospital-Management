package com.hospital.hospitalManagement3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.hospitalManagement3.service.AppointmentService;
import com.hospital.hospitalManagement3.service.DoctorService;
import com.hospital.hospitalManagement3.service.PatientService;


@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired PatientService patientService;
	@Autowired DoctorService doctorService;
	@Autowired AppointmentService appointmentService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("patientCount", patientService.getAll().size());
	    model.addAttribute("doctorCount", doctorService.getAll().size());
	    model.addAttribute("appointmentCount", appointmentService.getAll().size());
	    return "index";
	}

	@GetMapping("/login")
	public String login() {
	    return "login";
	}
		
}

