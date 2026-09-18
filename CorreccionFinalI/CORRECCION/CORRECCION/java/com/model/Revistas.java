package com.model;

import com.anotacion.MiComponente;

@MiComponente(name = "revista")
public class Revistas extends Recursos{
	public Revistas() {
		
	}

    @Override
    public void mostrar() {
        System.out.println("Libro: "+getTitulo());
    }

}
