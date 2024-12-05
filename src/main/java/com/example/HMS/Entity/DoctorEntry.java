package com.example.HMS.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Document(collection = "doctor_entries")
public class DoctorEntry {

    @Id

    private String id;

    private String username;

    private String password;

    private String name;
    private String specialization;
    private String availability;
    private String location;



}
