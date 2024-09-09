package com.example.parking_backend.controller;

import com.example.parking_backend.model.BookingRequest;
import com.example.parking_backend.service.BookingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking-requests")
public class BookingRequestController {

    @Autowired
    private BookingRequestService service;

    @GetMapping
    public List<BookingRequest> getAllRequests() {
        return service.getAllRequests();
    }

    @PostMapping
    public BookingRequest addRequest(@RequestBody BookingRequest request) {
        return service.addRequest(request);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        service.deleteRequest(id);
    }

    @PutMapping("/{id}")
    public BookingRequest updateRequest(@PathVariable Long id, @RequestBody BookingRequest request) {
        return service.updateRequest(id, request);
    }
}
