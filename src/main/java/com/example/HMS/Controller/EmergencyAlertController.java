package com.example.HMS.Controller;

import com.example.HMS.Entity.EmergencyAlert;
import com.example.HMS.service.EmergencyAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emergency-alerts")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmergencyAlertController {

    @Autowired
    private EmergencyAlertService emergencyAlertService;

    @PostMapping
    public EmergencyAlert createAlert(@RequestBody EmergencyAlert emergencyAlert) {
        return emergencyAlertService.createAlert(emergencyAlert);
    }

    @GetMapping
    public List<EmergencyAlert> getAllAlerts() {
        return emergencyAlertService.getAllAlerts();
    }

    @GetMapping("/{alertId}")
    public EmergencyAlert getAlertById(@PathVariable String alertId) {
        return emergencyAlertService.getAlertById(alertId);
    }

    @DeleteMapping("/{alertId}")
    public void deleteAlert(@PathVariable String alertId) {
        emergencyAlertService.deleteAlert(alertId);
    }

    // Update alert (assign doctor)
    @PutMapping("/{alertId}")
    public EmergencyAlert updateAlert(@PathVariable String alertId, @RequestBody EmergencyAlert updatedAlert) {
        return emergencyAlertService.updateAlert(alertId, updatedAlert);
    }
}
