package com.example.Farmer.service;

import com.example.Farmer.model.Farmer;
import com.example.Farmer.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {

    @Autowired
    private FarmerRepository farmerRepository;

    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    public Farmer registerFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }
}
