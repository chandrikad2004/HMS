package com.example.HMS.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "donors")
public class Donor {

    @Id
    private String id;

    private String donorType;
    private String name;
    private String contactInfo;
    private String location;
    private String description;
    private String availability;


    public Donor(String donorType, String name, String contactInfo, String location, String description, String availability) {
        this.donorType = donorType;
        this.name = name;
        this.contactInfo = contactInfo;
        this.location = location;
        this.description = description;
        this.availability = availability;
    }



}
