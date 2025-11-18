package com.enciclopedia.backend;

import java.util.ArrayList;

public class Administrador extends Usuario implements AgregarInformacion {

	//Constructor (de herencia)
	public Administrador(String nombreUsuario, String password, String fotoUsuario, ArrayList<Civilizacion> civFav) {
		super(nombreUsuario, password, fotoUsuario, civFav);
	}

	//Métodos
	public void agregarCivilizacion() {
		
	}
	
	public void editarCivilizacion() {
		
	}
	
	public void eliminarCivilizacion() {
		
	}
	
	@Override
	public void agregarPersonaje(Personaje p) {
		// TODO Auto-generated method stub
		
	}
	
	public void editarPersonaje() {
			
	}
		
	public void eliminarPersonaje() {
			
	}

	@Override
	public void agregarEvento(Evento e) {
		// TODO Auto-generated method stub
		
	}
	
	public void editarEvento() {
		
	}
		
	public void eliminarEvento() {
			
	}
	

}
