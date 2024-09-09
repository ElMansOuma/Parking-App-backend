package com.example.parking_backend.controller;

import com.example.parking_backend.model.GlobalDashboardStats;
import com.example.parking_backend.service.GlobalDashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalDashboardController {

    @Autowired
    private GlobalDashboardService globalDashboardService;

    @GetMapping("/api/global-dashboard/stats")
    public GlobalDashboardStats getGlobalDashboardStats() {
        return globalDashboardService.getGlobalDashboardStats();
    }
}
