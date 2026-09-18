package com.model;

import com.anotacion.MiComponente;

@MiComponente(name = "libro")
public class Libros extends Recursos{
	
	public Libros(){
        
    }

	@Override
	public void mostrar() {
	    System.out.println("Libro: "+getTitulo());
	    	
	}

	
   
}
