package com.example.HMS.Repository;

import com.example.HMS.Entity.Donor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DonorRepository extends MongoRepository<Donor, String> {

    List<Donor> findByDonorType(String donorType);
    List<Donor> findByLocation(String location);
    List<Donor> findByAvailability(String availability);
}
