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
@Builder
@NoArgsConstructor  
@AllArgsConstructor 
@MiComponente(name="arquero")
public class Arquero extends Personaje {
    private double precision;
   
    @Builder
    public Arquero(String nombre, int puntosDeVida, int ataque, int defensa, 
                   double precision, List<String> inventario,
                   String comportamientoIA) {

        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inventario = inventario;
        this.inteligenciaArtificial = comportamientoIA; 
        

        this.precision = precision;
        }
    @Override
    public void mostrarHabilidad() {
        System.out.println("El Arquero lanza flechas de fuego con precision de: "+ precision);
    }
}