package com.biblioteca;


import com.model.Recursos;
import com.model.Usuario;

public class Biblioteca {

	
	  private Recursos recurso;

	    private Usuario usuario;

	    public Biblioteca(Recursos recurso, Usuario usuario){

	        this.recurso = recurso;

	        this.usuario = usuario;

	        recurso.addObserver(usuario);

	    }

	    public void prestar(){

	        recurso.prestar();

	    }

	    public void devolver(){

	        recurso.devolver();

	    }

	    public void actualizarEstado(){

	        recurso.actualizarEstado();

	    }

	    public double costoMulta(){

	        if(recurso.getEstado().equals("Vencido")){

	            return usuario.getTipUser().calcularMulta();

	        }

	        return 0;

	    }
}