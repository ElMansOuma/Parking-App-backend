package com.example.parking_backend.controller;

import com.example.parking_backend.model.ParkingSlot;
import com.example.parking_backend.model.Vehicle;
import com.example.parking_backend.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/parking-slots")
    public List<ParkingSlot> getParkingSlots() {
        return dashboardService.getParkingSlots();
    }

    @GetMapping("/owned-vehicles")
    public List<Vehicle> getOwnedVehicles() {
        return dashboardService.getOwnedVehicles();
    }
}
