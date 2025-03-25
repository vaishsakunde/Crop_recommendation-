package com.example.Farmer.controller;

import com.example.Farmer.model.Farmer;
import com.example.Farmer.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmers")
@CrossOrigin(origins = "http://localhost:3000")
public class FarmerController {

    @Autowired
    private FarmerService farmerService;


    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerService.getAllFarmers();
    }


    @PostMapping("/signup")
    public Farmer registerFarmer(@RequestBody Farmer farmer) {
        return farmerService.registerFarmer(farmer);
    }
}
