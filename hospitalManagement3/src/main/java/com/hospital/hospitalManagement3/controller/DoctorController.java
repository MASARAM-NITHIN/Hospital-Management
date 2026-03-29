package com.hospital.hospitalManagement3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.hospitalManagement3.entity.Doctor;
import com.hospital.hospitalManagement3.service.AppointmentService;
import com.hospital.hospitalManagement3.service.DoctorService;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private AppointmentService appointmentService; // ✅ use service

    @GetMapping
    public String view(Model model) {
        model.addAttribute("doctors", doctorService.getAll());
        return "doctors";
    }

    @PostMapping("/add")
    public String add(Doctor d) {
        doctorService.save(d);
        return "doctors.html"; // ✅ correct
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {

        appointmentService.deleteByDoctorId(id); // ✅ delete related appointments
        doctorService.deleteById(id);            // ✅ delete doctor

        return "doctors.html"; // ✅ correct
    }
}