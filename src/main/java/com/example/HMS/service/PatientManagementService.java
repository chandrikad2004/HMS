package com.example.HMS.service;


import com.example.HMS.Entity.PatientManagement;
import com.example.HMS.Repository.PatientManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PatientManagementService {


    @Autowired
    private PatientManagementRepository patientManagementRepository;

    public PatientManagement registerPatient(PatientManagement patient) {
        return patientManagementRepository.save(patient);
    }
    public Optional<PatientManagement> getPatientById(String patientId) {
        return patientManagementRepository.findById(patientId);
    }

    public PatientManagement updatePatientMedicalHistory(String patientId, List<String> medicalHistory) {
        Optional<PatientManagement> patient = patientManagementRepository.findById(patientId);
        if (patient.isPresent()) {
            patient.get().setMedicalHistory(medicalHistory);
            return patientManagementRepository.save(patient.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found");
        }
    }

    public List<PatientManagement> getAllPatients() {
        return patientManagementRepository.findAll();
    }
    public PatientManagement getPatientMedicalRecords(String patientId) {
        return patientManagementRepository.findById(patientId).orElse(null);
    }
}
