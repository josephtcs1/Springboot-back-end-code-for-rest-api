package com.example.JavaBAckEndone.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaBAckEndone.model.JosephDetails;

@Repository
public interface JosephRepositary extends JpaRepository<JosephDetails,Long> {
}
