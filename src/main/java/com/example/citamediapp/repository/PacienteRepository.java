package com.example.citamediapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.citamediapp.model.Paciente;

public interface PacienteRepository extends JpaRepository< Paciente,Long> {

	List<Paciente> findByIdentificacion(String lastname);
	
}
