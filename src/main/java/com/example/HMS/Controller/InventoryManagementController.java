package com.example.HMS.Controller;

import com.example.HMS.Entity.InventoryManagement;
import com.example.HMS.service.InventoryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@CrossOrigin(origins = "http://localhost:4200/")
public class InventoryManagementController {

    @Autowired
    private InventoryManagementService inventoryManagementService;


    @GetMapping
    public List<InventoryManagement> getAllInventoryItems() {
        return inventoryManagementService.getAllInventoryItems();
    }


    @GetMapping("/{itemId}")
    public InventoryManagement getInventoryItemById(@PathVariable String itemId) {
        return inventoryManagementService.getInventoryItemById(itemId);
    }


    @PostMapping
    public InventoryManagement addInventoryItem(@RequestBody InventoryManagement inventoryManagement) {
        return inventoryManagementService.addInventoryItem(inventoryManagement);
    }


    @PutMapping("/{itemId}")
    public InventoryManagement updateInventoryItem(@PathVariable String itemId, @RequestParam int quantity) {
        return inventoryManagementService.updateInventoryItem(itemId, quantity);
    }


    @GetMapping("/reorder")
    public List<InventoryManagement> getItemsForReorder() {
        return inventoryManagementService.getItemsForReorder();
    }


    @PostMapping("/check-reorder")
    public void checkReorderNotifications() {
        inventoryManagementService.checkReorderNotifications();
    }
}
