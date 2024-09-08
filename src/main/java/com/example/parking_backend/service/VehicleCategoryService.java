// src/main/java/com/example/parking_backend/service/VehicleCategoryService.java
package com.example.parking_backend.service;

import com.example.parking_backend.model.VehicleCategory;
import com.example.parking_backend.repository.VehicleCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleCategoryService {
    @Autowired
    private VehicleCategoryRepository categoryRepository;

    public List<VehicleCategory> getAllCategories() {
        return categoryRepository.findAll();
    }

    public VehicleCategory addCategory(VehicleCategory category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
