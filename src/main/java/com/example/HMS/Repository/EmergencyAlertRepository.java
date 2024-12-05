package com.example.HMS.Repository;

import com.example.HMS.Entity.EmergencyAlert;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmergencyAlertRepository extends MongoRepository<EmergencyAlert, String> {

}
