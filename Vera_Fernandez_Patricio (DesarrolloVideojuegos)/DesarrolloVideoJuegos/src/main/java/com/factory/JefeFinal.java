package com.factory;

import java.util.List;

import com.anotacion.MiComponente;
import com.model.Personaje;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@MiComponente(name="jefe_final")
public class JefeFinal extends Personaje{

	 private double daño;
	 private String faseActual;
	@Builder
    public JefeFinal(String nombre, int puntosDeVida, int ataque, int defensa, 
                     String faseActual, double daño, 
                     boolean tieneEscudoGlobal, List<String> inventario) {
        
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inventario = inventario;
        
        this.faseActual = faseActual;
        this.daño = daño;
      }

    @Override
    public void mostrarHabilidad() {
        System.out.println("El jefe final " + nombre + " ha entrado en fase " + faseActual + "!");
    }
}
