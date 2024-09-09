package com.example.parking_backend.service;

import com.example.parking_backend.model.BookingRequest;
import com.example.parking_backend.repository.BookingRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingRequestService {
    @Autowired
    private BookingRequestRepository repository;

    public List<BookingRequest> getAllRequests() {
        return repository.findAll();
    }

    public BookingRequest addRequest(BookingRequest request) {
        return repository.save(request);
    }

    public void deleteRequest(Long id) {
        repository.deleteById(id);
    }

    public BookingRequest updateRequest(Long id, BookingRequest request) {
        BookingRequest existingRequest = repository.findById(id).orElse(null);
        if (existingRequest != null) {
            existingRequest.setDate(request.getDate());
            existingRequest.setVehicle(request.getVehicle());
            existingRequest.setSlot(request.getSlot());
            existingRequest.setStatus(request.getStatus());
            existingRequest.setRemarks(request.getRemarks());
            return repository.save(existingRequest);
        }
        return null;
    }
}
