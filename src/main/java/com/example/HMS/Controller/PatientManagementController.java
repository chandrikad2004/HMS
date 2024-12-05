package com.example.HMS.Controller;
import com.example.HMS.Entity.PatientManagement;
import com.example.HMS.service.PatientManagementService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "http://localhost:4200/")
public class PatientManagementController {
    @Autowired
    private PatientManagementService patientManagementService;


    @PostMapping("/register")
    public PatientManagement registerPatient(@RequestBody PatientManagement patient) {
        return patientManagementService.registerPatient(patient);
    }


    @GetMapping("/{id}")
    public Optional<PatientManagement> getPatientById(@PathVariable String id) {
        return patientManagementService.getPatientById(id);
    }


    @GetMapping("/{id}/records")
    public PatientManagement getPatientMedicalRecords(@PathVariable String id) {
        return patientManagementService.getPatientMedicalRecords(id);
    }


    @PutMapping("/{id}/medical-history")
    public PatientManagement updatePatientMedicalHistory(@PathVariable String id, @RequestBody List<String> medicalHistory) {
        return patientManagementService.updatePatientMedicalHistory(id, medicalHistory);
    }


    @GetMapping
    public List<PatientManagement> getAllPatients() {

        return patientManagementService.getAllPatients();
    }
}
