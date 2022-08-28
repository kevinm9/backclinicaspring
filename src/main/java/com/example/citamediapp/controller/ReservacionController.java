package com.example.citamediapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.citamediapp.model.Reservacion;
import com.example.citamediapp.repository.ReservacionRepository;


@CrossOrigin(origins = "*")
@RestController
public class ReservacionController {

	
	@Autowired
	ReservacionRepository reservacionRepository;

	@GetMapping("/reservacion")
	public ResponseEntity<List<Reservacion>> listar() {
		try {

			List<Reservacion> listaReservacion = new ArrayList<Reservacion>();
			
			reservacionRepository.findAll().forEach(listaReservacion::add);
			
			if (listaReservacion.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(listaReservacion, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/reservacion/{id}")
	public ResponseEntity<Reservacion> getTutorialById(@PathVariable("id") long id) {
		Optional<Reservacion> listaReservacion = reservacionRepository.findById(id);

		if (listaReservacion.isPresent()) {
			return new ResponseEntity<>(listaReservacion.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

	@PostMapping("/reservacion")
	public ResponseEntity<Reservacion> createTutorial(@RequestBody Reservacion requesteservacion) {
		try {
			Reservacion objreservacion = reservacionRepository
					.save(new Reservacion(requesteservacion.getIdpaciente(),
							requesteservacion.getIdespecialidad(),
							requesteservacion.getIddoctor(),
							requesteservacion.getFecha(),
							requesteservacion.getHora(),
							requesteservacion.getValor(),false));
			return new ResponseEntity<>(objreservacion, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
