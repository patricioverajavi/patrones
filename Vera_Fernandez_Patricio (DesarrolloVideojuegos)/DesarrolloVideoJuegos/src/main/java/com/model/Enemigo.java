package com.model;
 
import java.util.ArrayList;
import java.util.List;

import com.anotacion.MiComponente;

@MiComponente(name = "enemigo")
public record Enemigo(String nombre, int puntosDeVida, String rango, String comportamientoIA) {
	 public Enemigo clonarConVariante(String nuevoNombre, int vidaExtra) {
         return new Enemigo(nuevoNombre, this.puntosDeVida + vidaExtra, "Elite", "Agresivo");
	 }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String nombre;
        private int puntosDeVida;
        private String rango;
        private String comportamientoIA;
        
        public Builder() {
        
        }

        public Builder nombre(String nombre) { 
        	this.nombre = nombre; 
        	return this; 
        	}
        public Builder hp(int hp) { 
        	this.puntosDeVida = hp; 
        	return this; 
        	}
        public Builder rango(String rango) { 
        	this.rango = rango; 
        	return this; 
        	}
        public Builder comportamientoIA(String cia) { 
        	this.comportamientoIA = cia;
        	return this; }

        public Enemigo build() {
            return new Enemigo(nombre, puntosDeVida, rango, comportamientoIA);
        }
    
        }
    
    }
