package com.example.citamediapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.citamediapp.model.Doctor;
import com.example.citamediapp.model.Especialidad;
import com.example.citamediapp.model.Identificacion;
import com.example.citamediapp.model.Paciente;
import com.example.citamediapp.model.Reservacion;
import com.example.citamediapp.repository.DoctorRepository;
import com.example.citamediapp.repository.EspecialidadRepository;
import com.example.citamediapp.repository.IdentificacionRepository;
import com.example.citamediapp.repository.PacienteRepository;
import com.example.citamediapp.repository.ReservacionRepository;


@RestController
public class IndexController {

	@Autowired
	DoctorRepository doctorRepository;
	@Autowired
	EspecialidadRepository especialidadRepository;
	@Autowired
	IdentificacionRepository identificacionRepository;
	@Autowired
	PacienteRepository pacienteRepository;
	@Autowired
	ReservacionRepository reservacionRepository;
	
	
	@RequestMapping("/sql")
    public String findAll() {
        
		doctorRepository.save(new Doctor("KEVIN DOCTOR"));
		doctorRepository.save(new Doctor("JOFFRE DOCTOR"));
		
		especialidadRepository.save(new Especialidad("DERMATOLOGIA"));
		especialidadRepository.save(new Especialidad("GINECOLOGIA"));
		especialidadRepository.save(new Especialidad("PEDIATRIA"));
		
		identificacionRepository.save(new Identificacion("CEDULA"));
		identificacionRepository.save(new Identificacion("PASAPORTE"));
		identificacionRepository.save(new Identificacion("RUC"));
		
		pacienteRepository.save(new Paciente("KEVIN PACIENTE","1250709209"));
		pacienteRepository.save(new Paciente("JOFFRE PACIENTE","1251251250"));
		
		reservacionRepository.save( new Reservacion(1,1,1,"22-12-22","08:40",1,true));
		
		
		
        return"sql ejecutado";
        
        
    }
	
	
	
}
