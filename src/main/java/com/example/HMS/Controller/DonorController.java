package com.example.HMS.Controller;

import com.example.HMS.Entity.Donor;
import com.example.HMS.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donors")
@CrossOrigin(origins = "http://localhost:4200/")
public class DonorController {

    private final DonorService donorService;

    @Autowired
    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }


    @PostMapping("/register")
    public Donor registerDonor(@RequestBody Donor donor) {
        return donorService.registerDonor(donor);
    }


    @GetMapping("/all")
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }


    @GetMapping("/type/{donorType}")
    public List<Donor> getDonorsByType(@PathVariable String donorType) {
        return donorService.getDonorsByType(donorType);
    }


    @GetMapping("/location/{location}")
    public List<Donor> getDonorsByLocation(@PathVariable String location) {
        return donorService.getDonorsByLocation(location);
    }


    @GetMapping("/availability/{availability}")
    public List<Donor> getDonorsByAvailability(@PathVariable String availability) {
        return donorService.getDonorsByAvailability(availability);
    }


    @GetMapping("/{id}")
    public Optional<Donor> getDonorById(@PathVariable String id) {
        return donorService.getDonorById(id);
    }
}
