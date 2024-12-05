package com.example.HMS.service;

import com.example.HMS.Entity.Doctor;
import com.example.HMS.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }


    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }


    public Optional<Doctor> getDoctorById(String id) {
        return doctorRepository.findById(id);
    }


    public List<Doctor> getDoctorsBySpecialization(String specialization) {
        return doctorRepository.findBySpecialization(specialization);
    }


    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void removeDoctorById(String id) {
        doctorRepository.deleteById(id);
    }
}
