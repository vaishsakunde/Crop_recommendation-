package com.example.Farmer.repository;

import com.example.Farmer.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
    Farmer findByEmail(String email);
}
