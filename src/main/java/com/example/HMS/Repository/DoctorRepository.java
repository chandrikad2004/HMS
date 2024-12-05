package com.example.HMS.Repository;

import com.example.HMS.Entity.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {

    List<Doctor> findBySpecialization(String specialization);
}
