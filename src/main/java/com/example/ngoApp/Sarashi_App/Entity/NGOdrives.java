package com.example.ngoApp.Sarashi_App.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NGOdrives {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long driveId;

    private String driveName;

    private int driveCapacity;

    private String driveLocation;

    private String driveMotive;

}
