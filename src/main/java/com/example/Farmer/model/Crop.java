package com.example.Farmer.model;

import com.example.Farmer.model.Farmer;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "crops")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Crop {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cropId;
    private String name;
    private String season;
    private String waterRequirement;
    private String temperatureRange;
    private String soilType;
    private Double profitPerHectare;

    @ManyToOne
    @JoinColumn(name = "farmer_id", referencedColumnName = "id")
    private Farmer farmer;
}
