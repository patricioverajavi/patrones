package com.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor  
@AllArgsConstructor 
public class Mago extends Personaje {
    
    private String hechoPrincipal;
    @Builder
    public Mago(String nombre, int puntosDeVida, int ataque, int defensa,
    		String hechoPrincipal, List<String> inventario,
                String comportamientoIA) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inventario = inventario;
        this.inteligenciaArtificial = comportamientoIA; 
        
        this.hechoPrincipal = hechoPrincipal;
    }
    @Override
    public void mostrarHabilidad() {
        System.out.println("El Mago lanza una Bola de Fuego!"+ hechoPrincipal);
    }
}