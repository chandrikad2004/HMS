package com.example.HMS.service;

import com.example.HMS.Entity.EmergencyAlert;
import com.example.HMS.Repository.EmergencyAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmergencyAlertService {

    @Autowired
    private EmergencyAlertRepository emergencyAlertRepository;

    public List<EmergencyAlert> getAllAlerts() {
        return emergencyAlertRepository.findAll();
    }

    public EmergencyAlert getAlertById(String alertId) {
        return emergencyAlertRepository.findById(alertId).orElse(null);
    }

    public EmergencyAlert createAlert(EmergencyAlert emergencyAlert) {
        return emergencyAlertRepository.save(emergencyAlert);
    }

    public void deleteAlert(String alertId) {
        emergencyAlertRepository.deleteById(alertId);
    }

    // Update the alert (doctor assignment and response time)
    public EmergencyAlert updateAlert(String alertId, EmergencyAlert updatedAlert) {
        Optional<EmergencyAlert> existingAlertOpt = emergencyAlertRepository.findById(alertId);
        if(existingAlertOpt.isPresent()) {
            EmergencyAlert existingAlert = existingAlertOpt.get();
            existingAlert.setDoctorAssigned(updatedAlert.getDoctorAssigned());
            existingAlert.setResponseTime(updatedAlert.getResponseTime());
            return emergencyAlertRepository.save(existingAlert);  // Save and return the updated alert
        }
        return null;  // In case alert is not found
    }
}
