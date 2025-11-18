package com.enciclopedia.backend;

import java.util.ArrayList;

public class Usuario implements Informacion{
	//Atributos
	protected String nombreUsuario;
	protected String password;
	protected String fotoUsuario;
	private ArrayList<Civilizacion> civFav;
	
	//Constructor
	public Usuario(String nombreUsuario, String password, String fotoUsuario, ArrayList<Civilizacion> civFav) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.fotoUsuario = fotoUsuario;
		civFav = new ArrayList<>();
	}

	//Getters y Setters
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	public ArrayList<Civilizacion> getCivFav() {
		return civFav;
	}

	public void setCivFav(ArrayList<Civilizacion> civFav) {
		this.civFav = civFav;
	}
	
	//Métodos
	public void buscarInformacion() {
		
	}
	
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		
	}
	
	public void guardarCivFav(Civilizacion c) {
		
	}
	
}
