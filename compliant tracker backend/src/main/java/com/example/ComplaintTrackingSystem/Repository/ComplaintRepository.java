package com.example.ComplaintTrackingSystem.Repository;

import com.example.ComplaintTrackingSystem.Entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}
