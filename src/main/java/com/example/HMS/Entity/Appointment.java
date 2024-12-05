package com.example.HMS.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "appointments")
public class Appointment {

    @Id
    private String id;
    private String doctorName;
    private String specialization;
    private String date;
    private String timeSlot;
    private String patientName;



}
