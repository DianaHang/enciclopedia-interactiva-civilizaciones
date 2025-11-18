package com.enciclopedia.backend;

import java.util.Date;

public class Evento implements Informacion {
	//Atributos
	private Date fecha;
	private String titulo;
	private String descripcion;
	
	//Constructor
	public Evento(Date fecha, String titulo, String descripcion) {
		super();
		this.fecha = fecha;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	
	//Getters y Setters
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Métodos
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		
	}
	
	
}
