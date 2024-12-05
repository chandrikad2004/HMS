package com.example.HMS.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "PatientEntry")
public class PatientEntry {
    private String username;
    private String password;
    private String name;
    private String dob;
    private String contact;
    private String address;
    private String emergencyContact;
    private String medicalHistory;



}
