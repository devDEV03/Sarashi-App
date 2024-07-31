package com.example.ngoApp.Sarashi_App.Repository;

import com.example.ngoApp.Sarashi_App.Entity.NGOmembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ngoMembersRepository extends JpaRepository<Long, NGOmembers> {
}
