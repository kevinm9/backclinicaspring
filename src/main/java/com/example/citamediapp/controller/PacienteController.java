package com.example.citamediapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.citamediapp.model.Paciente;
import com.example.citamediapp.repository.PacienteRepository;

@CrossOrigin(origins = "*")
@RestController
public class PacienteController {

	
	@Autowired
	PacienteRepository pacienteRepository;

	@GetMapping("/paciente")
	public ResponseEntity<List<Paciente>> listar() {
		try {

			List<Paciente> listaPaciente = new ArrayList<Paciente>();
			
			pacienteRepository.findAll().forEach(listaPaciente::add);
			
			if (listaPaciente.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(listaPaciente, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/paciente/cedula")
	public ResponseEntity<List<Paciente>> listarporcedula(@RequestParam String cedula) {
		try {
	
			return new ResponseEntity<List<Paciente>>(pacienteRepository.findByIdentificacion(cedula), HttpStatus.OK);
			

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
