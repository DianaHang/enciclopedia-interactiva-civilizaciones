package com.enciclopedia.backend;

import java.util.ArrayList;

public class GestorEnciclopedia {
	//Atributos
	private ArrayList <Civilizacion> civilizaciones;
	private ArrayList <Usuario> users;
	
	//Constructor
	public GestorEnciclopedia(ArrayList<Civilizacion> civilizaciones, ArrayList<Usuario> users) {
		this.civilizaciones = civilizaciones;
		this.users = users;
	}
	
	//Getters y Setters
	public ArrayList<Civilizacion> getCivilizaciones() {
		return civilizaciones;
	}
	public void setCivilizaciones(ArrayList<Civilizacion> civilizaciones) {
		this.civilizaciones = civilizaciones;
	}
	public ArrayList<Usuario> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<Usuario> users) {
		this.users = users;
	}
	
	//Métodos
	public void buscarPorCriterio() {
		
	}
	
	public void agregarCivilizacion(Civilizacion c) {
		
	}
	
	public void eliminarCivilizacion(Civilizacion c) {
		
	}

	public Usuario buscarUsuario(String nombre) {
		return null;
		
	}
	
	public void mostrarLineaTiempo() {
		
	}
	
	public void gestionarDatos() {
		
	}

	public void validarDatos() {

	}
}
