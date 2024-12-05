package com.example.HMS.Repository;

import com.example.HMS.Entity.DoctorEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface DoctorEntryRepository extends MongoRepository<DoctorEntry, String> {
    Optional<DoctorEntry> findByUsername(String username);  // To fetch a doctor by username

    List<DoctorEntry> findBySpecialization(String specialization);
}
