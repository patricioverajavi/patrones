package com.model;

import com.anotacion.MiComponente;


@MiComponente(name = "tesis")
public class Tesis extends Recursos{

	public Tesis() {
		
	}
	
    @Override
    public void mostrar() {
        System.out.println("Libro: "+getTitulo());
    }

}
