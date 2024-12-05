package com.example.HMS.service;

import com.example.HMS.Entity.DoctorEntry;
import com.example.HMS.Repository.DoctorEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorEntryService {

    private final DoctorEntryRepository doctorEntryRepository;

    @Autowired
    public DoctorEntryService(DoctorEntryRepository doctorEntryRepository) {
        this.doctorEntryRepository = doctorEntryRepository;
    }


    public DoctorEntry registerDoctorEntry(DoctorEntry doctorEntry) {
        return doctorEntryRepository.save(doctorEntry);
    }


    public List<DoctorEntry> getAllDoctorEntries() {
        return doctorEntryRepository.findAll();
    }


    public Optional<DoctorEntry> getDoctorEntryByUsername(String username) {
        return doctorEntryRepository.findByUsername(username);
    }

    public List<DoctorEntry> getDoctorsBySpecialization(String specialization) {
        return doctorEntryRepository.findBySpecialization(specialization);
    }
}