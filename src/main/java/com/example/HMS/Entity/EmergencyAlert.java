package com.example.HMS.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "emergency_alerts")
public class EmergencyAlert {

    @Id
    private String id;

    private String patientId;
    private String alertTime;
    private String doctorAssigned;
    private String responseTime;
    private String alertStatus;




}
