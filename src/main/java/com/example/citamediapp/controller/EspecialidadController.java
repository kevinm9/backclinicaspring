package com.example.citamediapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.citamediapp.model.Especialidad;
import com.example.citamediapp.repository.EspecialidadRepository;

@CrossOrigin(origins = "*")
@RestController
public class EspecialidadController {

	
	@Autowired
	EspecialidadRepository especialidadRepository;

	@GetMapping("/especialidad")
	public ResponseEntity<List<Especialidad>> listar() {
		try {

			List<Especialidad> listaEspecialidad = new ArrayList<Especialidad>();
			
			especialidadRepository.findAll().forEach(listaEspecialidad::add);
			
			if (listaEspecialidad.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(listaEspecialidad, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
