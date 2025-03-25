package com.example.Farmer.repository;

import com.example.Farmer.model.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {

    List<Crop> findByFarmerId(Long farmerId);


    List<Crop> findByNameIgnoreCase(String name);


    List<Crop> findBySeason(String season);
}
