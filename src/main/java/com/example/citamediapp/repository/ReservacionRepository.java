package com.example.citamediapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.citamediapp.model.Reservacion;

public interface ReservacionRepository  extends JpaRepository< Reservacion,Long> {

}
