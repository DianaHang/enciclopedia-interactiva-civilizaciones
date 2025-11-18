package com.enciclopedia.backend;

import java.util.ArrayList;

public class Administrador extends Usuario implements AgregarInformacion {
	//Atributo
	 private GestorEnciclopedia gestor;
	
	//Constructor (de herencia)
	public Administrador(String nombreUsuario, String password, String fotoUsuario, ArrayList<Civilizacion> civFav,GestorEnciclopedia gestor) {
		super(nombreUsuario, password, fotoUsuario, civFav);
		this.gestor = gestor;
	}

	//Getters y setters
	public GestorEnciclopedia getGestor() {
		return gestor;
	}

	public void setGestor(GestorEnciclopedia gestor) {
		this.gestor = gestor;
	}

	//Métodos de administrador para civilizaciones 
	 public void agregarCivilizacion(Civilizacion c) {
	        gestor.agregarCivilizacion(c);
	    }

	    public void editarCivilizacion(Civilizacion civ, String nuevoNombre, String nuevaDesc) {
	        civ.setNombre(nuevoNombre);
	        civ.setDescripcion(nuevaDesc);
	    }

	    public void eliminarCivilizacion(Civilizacion c) {
	        gestor.eliminarCivilizacion(c);
	    }

		//Metodos para personajes 
	
	@Override
	public void agregarPersonaje(Personaje p) {
		// TODO Auto-generated method stub
		
	}

	public void agregarPersonaje(Personaje p, Civilizacion civ) {
        if (civ != null) {
            civ.agregarPersonaje(p);
        }
    }
	
    public void editarPersonaje(Personaje p, String nuevoNombre, String nuevosAportes, String nuevaFoto) {
        p.setNombre(nuevoNombre);
        p.setAportes(nuevosAportes);
        p.setFotoPers(nuevaFoto);
    }

    public void eliminarPersonaje(Personaje p, Civilizacion civ) {
        if (civ != null && civ.getPersonaje() != null) {
            civ.getPersonaje().remove(p);
        }
    }
// Métodods para eventos 
	@Override
	public void agregarEvento(Evento e) {
		// TODO Auto-generated method stub
		
	}
	
	public void agregarEvento(Evento e, Civilizacion civ) {
        if (civ != null) {
            civ.agregarEvento(e);
        }
    }

    public void editarEvento(Evento e, String nuevoTitulo, String nuevaDesc) {
        e.setTitulo(nuevoTitulo);
        e.setDescripcion(nuevaDesc);
    }

    public void eliminarEvento(Evento e, Civilizacion civ) {
        if (civ != null && civ.getEvento() != null) {
            civ.getEvento().remove(e);
        }
	}
}
