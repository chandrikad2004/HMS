package com.example.HMS.Controller;

import com.example.HMS.Entity.Doctor;
import com.example.HMS.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "http://localhost:4200/")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @GetMapping
    public List<Doctor> getDoctors() {
        return doctorService.getAllDoctors();
    }


    @GetMapping("/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable String id) {
        return doctorService.getDoctorById(id);
    }

    @GetMapping("/specialization/{specialization}")
    public List<Doctor> getDoctorsBySpecialization(@PathVariable String specialization) {
        return doctorService.getDoctorsBySpecialization(specialization);
    }


    @PostMapping
    public String addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
        return "Doctor added successfully!";
    }


    @DeleteMapping("/{id}")
    public String removeDoctor(@PathVariable String id) {
        doctorService.removeDoctorById(id);
        return "Doctor removed successfully!";
    }
}
