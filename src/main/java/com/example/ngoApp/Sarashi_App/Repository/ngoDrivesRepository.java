package com.example.ngoApp.Sarashi_App.Repository;

import com.example.ngoApp.Sarashi_App.Entity.NGOdrives;
import com.example.ngoApp.Sarashi_App.Entity.NGOs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ngoDrivesRepository extends JpaRepository<Long, NGOdrives> {
}
