package com.example.citamediapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.citamediapp.model.Identificacion;
import com.example.citamediapp.repository.IdentificacionRepository;

@CrossOrigin(origins = "*")
@RestController
public class IdentificacionController {

	@Autowired
	IdentificacionRepository identificacionRepository;

	@GetMapping("/identificacion")
	public ResponseEntity<List<Identificacion>> listar() {
		try {

			List<Identificacion> listaIdentificacion = new ArrayList<Identificacion>();

			identificacionRepository.findAll().forEach(listaIdentificacion::add);

			if (listaIdentificacion.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(listaIdentificacion, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}