package com.example.HMS.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "inventory")
public class InventoryManagement {

    @Id
    private String itemId;
    private String name;
    private String category;
    private int quantity;
    private int reorderLevel;
    private LocalDateTime lastUpdated;
    public boolean isLowStock() {
        return this.quantity < this.reorderLevel;
    }
}
