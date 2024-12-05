package com.example.HMS.service;

import com.example.HMS.Entity.Donor;
import com.example.HMS.Repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonorService {

    private final DonorRepository donorRepository;

    @Autowired
    public DonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public Donor registerDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    public List<Donor> getDonorsByType(String donorType) {
        return donorRepository.findByDonorType(donorType);
    }

    public List<Donor> getDonorsByLocation(String location) {
        return donorRepository.findByLocation(location);
    }

    public List<Donor> getDonorsByAvailability(String availability) {
        return donorRepository.findByAvailability(availability);
    }

    public Optional<Donor> getDonorById(String id) {
        return donorRepository.findById(id);
    }
}
