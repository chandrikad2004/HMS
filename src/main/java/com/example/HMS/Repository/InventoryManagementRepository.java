package com.example.HMS.Repository;

import com.example.HMS.Entity.InventoryManagement;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InventoryManagementRepository extends MongoRepository<InventoryManagement, String> {


    List<InventoryManagement> findByQuantityLessThan(int reorderLevel);


}
