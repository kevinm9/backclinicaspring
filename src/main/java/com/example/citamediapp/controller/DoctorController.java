package com.example.citamediapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.citamediapp.model.Doctor;
import com.example.citamediapp.repository.DoctorRepository;


@CrossOrigin(origins = "*")
@RestController
public class DoctorController {

	
	@Autowired
	DoctorRepository doctorRepository;

	@GetMapping("/doctor")
	public ResponseEntity<List<Doctor>> listar() {
		try {

			List<Doctor> listaDoctor = new ArrayList<Doctor>();
			
			doctorRepository.findAll().forEach(listaDoctor::add);
			
			if (listaDoctor.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(listaDoctor, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
