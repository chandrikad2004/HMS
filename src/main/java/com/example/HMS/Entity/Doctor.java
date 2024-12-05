package com.example.HMS.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "doctor_avail")
public class Doctor {

    private String id;
    private String name;
    private String specialization;
    private String availability;
    private String location;
    private List<String> availableDates;
    private List<String> timeSlots;


    public Doctor(String id, String name, String specialization, String availability, String location,
                  List<String> availableDates, List<String> timeSlots) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
        this.location = location;
        this.availableDates = availableDates;
        this.timeSlots = timeSlots;
    }


}
