package com.example.HMS.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Data
@Document(collection = "patient_management")
public class PatientManagement {

    @Id
    private String patientId;
    private String name;
    private LocalDate dateOfBirth;
    private String contactInfo;
    private String address;
    private String emergencyContact;
    private List<String> medicalHistory;
    private List<String> upcomingAppointments;
    private List<String> treatmentProgress;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<String> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<String> getUpcomingAppointments() {
        return upcomingAppointments;
    }

    public void setUpcomingAppointments(List<String> upcomingAppointments) {
        this.upcomingAppointments = upcomingAppointments;
    }

    public List<String> getTreatmentProgress() {
        return treatmentProgress;
    }

    public void setTreatmentProgress(List<String> treatmentProgress) {
        this.treatmentProgress = treatmentProgress;
    }

}
