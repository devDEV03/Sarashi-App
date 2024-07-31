package com.example.ngoApp.Sarashi_App.Repository;

import com.example.ngoApp.Sarashi_App.Entity.NGOs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NGOrepository extends JpaRepository<Long, NGOs> {
}
