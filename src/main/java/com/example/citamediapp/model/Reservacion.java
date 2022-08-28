package com.example.citamediapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "reservacion")
public class Reservacion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "idPaciente")
	private int idpaciente;
	@Column(name = "idespecialidad")
	private int idespecialidad;
	@Column(name = "iddoctor")
	private int iddoctor;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "hora")
	private String hora;
	@Column(name = "valor")
	private double valor;
	@Column(name = "pagado")
	private boolean pagado;
	
	
	
	
	public Reservacion() {
	}
	
	public Reservacion(int idpaciente, int idespecialidad, int iddoctor, String fecha, String hora, double valor,
			boolean pagado) {
		this.idpaciente = idpaciente;
		this.idespecialidad = idespecialidad;
		this.iddoctor = iddoctor;
		this.fecha = fecha;
		this.hora = hora;
		this.valor = valor;
		this.pagado = pagado;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getIdpaciente() {
		return idpaciente;
	}
	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
	}
	public int getIdespecialidad() {
		return idespecialidad;
	}
	public void setIdespecialidad(int idespecialidad) {
		this.idespecialidad = idespecialidad;
	}
	public int getIddoctor() {
		return iddoctor;
	}
	public void setIddoctor(int iddoctor) {
		this.iddoctor = iddoctor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}


	
	
}
