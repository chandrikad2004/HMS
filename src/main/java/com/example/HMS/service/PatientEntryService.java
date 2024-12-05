package com.example.HMS.service;

import com.example.HMS.Repository.PatientEntryRepository;
import com.example.HMS.Entity.PatientEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientEntryService {

    private final PatientEntryRepository patientEntryRepository;

    @Autowired
    public PatientEntryService(PatientEntryRepository patientEntryRepository) {
        this.patientEntryRepository = patientEntryRepository;
    }


    public List<PatientEntry> getAllPatientEntries() {
        return patientEntryRepository.findAll();
    }


    public PatientEntry registerPatientEntry(PatientEntry patientEntry) {
        return patientEntryRepository.save(patientEntry);
    }


    public Optional<PatientEntry> getPatientEntryByUsername(String username) {
        return Optional.ofNullable(patientEntryRepository.findByUsername(username));
    }
}
