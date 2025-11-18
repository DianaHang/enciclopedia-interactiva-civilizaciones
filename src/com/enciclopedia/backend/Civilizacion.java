package com.enciclopedia.backend;

import java.util.ArrayList;

public class Civilizacion implements Informacion, AgregarInformacion {
	//Atributos
	private String nombre;
	private String region;
	private String epoca;
	private String descripcion;
	private String fotoCiv;
	private ArrayList<Personaje> personaje;
	private ArrayList<Evento> evento;
	
	//Constructor (con composición)
	public Civilizacion(String nombre, String region, String epoca, String descripcion, String fotoCiv,
			ArrayList<Personaje> personaje, ArrayList<Evento> evento) {
		super();
		this.nombre = nombre;
		this.region = region;
		this.epoca = epoca;
		this.descripcion = descripcion;
		this.fotoCiv = fotoCiv;
		this.personaje = personaje;
		this.evento = evento;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFotoCiv() {
		return fotoCiv;
	}

	public void setFotoCiv(String fotoCiv) {
		this.fotoCiv = fotoCiv;
	}

	public ArrayList<Personaje> getPersonaje() {
		return personaje;
	}

	public void setPersonaje(ArrayList<Personaje> personaje) {
		this.personaje = personaje;
	}

	public ArrayList<Evento> getEvento() {
		return evento;
	}

	public void setEvento(ArrayList<Evento> evento) {
		this.evento = evento;
	}

	//Métodos
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarPersonaje(Personaje p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarEvento(Evento e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
