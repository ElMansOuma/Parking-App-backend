package com.example.parking_backend.model;

public class GlobalDashboardStats {
    private int totalBookings;
    private int totalParkingSlots;
    private int totalVehicles;
    private int totalVehicleOwners;

    // Getters and setters
    public int getTotalBookings() {
        return totalBookings;
    }

    public void setTotalBookings(int totalBookings) {
        this.totalBookings = totalBookings;
    }

    public int getTotalParkingSlots() {
        return totalParkingSlots;
    }

    public void setTotalParkingSlots(int totalParkingSlots) {
        this.totalParkingSlots = totalParkingSlots;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public int getTotalVehicleOwners() {
        return totalVehicleOwners;
    }

    public void setTotalVehicleOwners(int totalVehicleOwners) {
        this.totalVehicleOwners = totalVehicleOwners;
    }
}
