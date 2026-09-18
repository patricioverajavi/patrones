package com.model;

import java.util.List;

import com.anotacion.MiComponente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor  
@AllArgsConstructor 
@MiComponente(name="amigo")
public class Amigo extends Personaje{
	private String especialidad;
	
	@Builder
    public Amigo(String nombre, int puntosDeVida, int ataque, int defensa, 
                 String especialidad, List<String> inventario) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inventario = inventario;
        
        this.especialidad = especialidad;
        
    }
	@Override
    public void mostrarHabilidad() {
        System.out.println("El Amigo proporciona bonificaciones de " + especialidad);
    }

}
