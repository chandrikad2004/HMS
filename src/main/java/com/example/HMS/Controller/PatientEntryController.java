package com.example.HMS.Controller;

import com.example.HMS.Entity.PatientEntry;
import com.example.HMS.service.PatientEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patientsEntry")
@CrossOrigin(origins = "http://localhost:4200/")
public class PatientEntryController {


    private final PatientEntryService patientEntryService;

    @Autowired
    public PatientEntryController(PatientEntryService patientEntryService) {
        this.patientEntryService = patientEntryService;
    }

    @PostMapping("/patient-register")
    public PatientEntry registerPatient(@RequestBody PatientEntry patientEntry) {
        return patientEntryService.registerPatientEntry(patientEntry);
    }

    @GetMapping("/all")
    public List<PatientEntry> getAllPatients() {
        return patientEntryService.getAllPatientEntries();
    }


    @GetMapping("/username/{username}")
    public Optional<PatientEntry> getPatientByUsername(@PathVariable String username) {
        return patientEntryService.getPatientEntryByUsername(username);
    }
}
