package com.example.HMS.Repository;

import com.example.HMS.Entity.PatientEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientEntryRepository extends MongoRepository<PatientEntry, String> {

    PatientEntry findByUsername(String username);
}
