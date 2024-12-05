package com.example.HMS.service;

import com.example.HMS.Entity.InventoryManagement;
import com.example.HMS.Repository.InventoryManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InventoryManagementService {

    @Autowired
    private InventoryManagementRepository inventoryManagementRepository;


    public List<InventoryManagement> getAllInventoryItems() {
        return inventoryManagementRepository.findAll();
    }


    public InventoryManagement getInventoryItemById(String itemId) {
        return inventoryManagementRepository.findById(itemId).orElse(null);
    }


    public InventoryManagement addInventoryItem(InventoryManagement inventoryManagement) {
        inventoryManagement.setLastUpdated(LocalDateTime.now());
        return inventoryManagementRepository.save(inventoryManagement);
    }


    public InventoryManagement updateInventoryItem(String itemId, int quantity) {
        InventoryManagement item = inventoryManagementRepository.findById(itemId).orElse(null);
        if (item != null) {
            item.setQuantity(quantity);
            item.setLastUpdated(LocalDateTime.now());
            return inventoryManagementRepository.save(item);
        }
        return null;
    }

    public List<InventoryManagement> getItemsForReorder() {
        int reorderLevel = 10;  // You can set this dynamically or pass as an argument
        return inventoryManagementRepository.findByQuantityLessThan(reorderLevel);
    }



    public void checkReorderNotifications() {
        List<InventoryManagement> lowStockItems = getItemsForReorder();
        for (InventoryManagement item : lowStockItems) {
            sendReorderNotification(item);
        }
    }


    private void sendReorderNotification(InventoryManagement item) {
        System.out.println("Reorder Alert: Item " + item.getName() + " (ID: " + item.getItemId() +
                ") has low stock (current quantity: " + item.getQuantity() +
                "). Please reorder. Reorder Level: " + item.getReorderLevel());
    }
}
