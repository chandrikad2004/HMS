package com.example.HMS.Repository;

import com.example.HMS.Entity.PatientManagement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientManagementRepository extends MongoRepository<PatientManagement, String> {


    List<PatientManagement> findByName(String name);
}
