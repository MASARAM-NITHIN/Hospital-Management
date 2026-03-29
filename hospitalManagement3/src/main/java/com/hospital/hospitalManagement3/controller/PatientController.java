package com.hospital.hospitalManagement3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.hospitalManagement3.entity.Patient;
import com.hospital.hospitalManagement3.service.PatientService;


@Controller
@RequestMapping("/patients")
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	@GetMapping
	public String view(Model model) {
		model.addAttribute("patients", patientService.getAll());
		return "patients";
	}
	
	@PostMapping("/add")
	public String add(Patient p) {
		patientService.save(p);
		return "patients.html";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam int id) {
		patientService.delete(id);
		return "patients.html";
	}
	
}

