package com.example.ComplaintTrackingSystem.Controller;

import com.example.ComplaintTrackingSystem.ServiceLayer.ComplaintService;
import com.example.ComplaintTrackingSystem.Entity.Complaint;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

    private final ComplaintService service;

    // Constructor injection
    public ComplaintController(ComplaintService service) {
        this.service = service;
    }

    // Create new complaint
    @PostMapping
    public Complaint create(@RequestBody Complaint complaint) {
        return service.addComplaint(complaint);
    }

    // Get all complaints
    @GetMapping
    public List<Complaint> getAll() {
        return service.getAllComplaints();
    }

    // Update complaint status
    @PutMapping("/{id}/status")
    public Complaint updateStatus(@PathVariable Long id, @RequestParam String status) {
        return service.updateStatus(id, status);
    }
}
