package com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import state.Disponible;
import state.EstadosPrestamo;

public abstract class Recursos {

	private String codigo;
    private String titulo;

    private EstadosPrestamo estado;

    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;
    private List<Observer> observers = new ArrayList<Observer>();
    public abstract void mostrar();
    
    public Recursos() {
        estado = new Disponible();
    }

    public void prestar() {
        estado.prestar(this);
    }

    public void devolver() {
        estado.devolver(this);
    }

    public void actualizarEstado() {
        estado.verificarEstado(this);
    }
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    private void notificar(){

        for(Observer o: observers){

            o.notifyObservers("El recurso '" + titulo +
                    "' cambió al estado " + estado.getEstado());

        }
    }

    

    
    public EstadosPrestamo getEstado() {
		return estado;
	}

	public void setEstado(EstadosPrestamo estado) {
		this.estado = estado;
	}

	public String getTitulo() {
        return titulo;
    }


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
    
	
}
