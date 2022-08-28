package com.example.citamediapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.citamediapp.model.Doctor;

public interface DoctorRepository extends JpaRepository< Doctor,Long> {

}
