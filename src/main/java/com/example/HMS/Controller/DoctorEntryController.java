package com.example.HMS.Controller;

import com.example.HMS.Entity.DoctorEntry;
import com.example.HMS.Views;
import com.example.HMS.service.DoctorEntryService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctorsEntry")
@CrossOrigin(origins = "http://localhost:4200/")
public class DoctorEntryController {

    private final DoctorEntryService doctorEntryService;

    @Autowired
    public DoctorEntryController(DoctorEntryService doctorEntryService) {
        this.doctorEntryService = doctorEntryService;
    }


    @PostMapping("/doctor-register")
    public DoctorEntry registerDoctor(@RequestBody DoctorEntry doctorEntry) {
        return doctorEntryService.registerDoctorEntry(doctorEntry);
    }


    @GetMapping("/all")
    public List<DoctorEntry> getAllDoctors() {
        return doctorEntryService.getAllDoctorEntries();
    }


    @GetMapping("/username/{username}")
    public Optional<DoctorEntry> getDoctorByUsername(@PathVariable String username) {
        return doctorEntryService.getDoctorEntryByUsername(username);
    }

    @GetMapping("/specialization/{specialization}")
    public List<DoctorEntry> getDoctorsBySpecialization(@PathVariable String specialization) {
        return doctorEntryService.getDoctorsBySpecialization(specialization);
    }
}
