package com.example.ComplaintTrackingSystem.ServiceLayer;
import com.example.ComplaintTrackingSystem.Repository.ComplaintRepository;
import com.example.ComplaintTrackingSystem.Entity.Complaint;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class ComplaintService {
    private   final ComplaintRepository repo;
    public ComplaintService(ComplaintRepository repo) {
        this.repo = repo;
    }
    public Complaint addComplaint(Complaint c) {
        c.setStatus("OPEN");
        return repo.save(c);
    }
    public Complaint updateStatus(Long id, String status) {
        Complaint c = repo.findById(id).orElseThrow(()->new RuntimeException("Not found"));
        c.setStatus(status);
        return repo.save(c);
    }
    public List<Complaint> getAllComplaints() {
        return repo.findAll();
    }

}