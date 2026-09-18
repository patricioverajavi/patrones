package com.model;
import com.anotacion.MiComponente;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor 
@ToString(callSuper = true)
@MiComponente(name="guerrero")
public class Guerrero extends Personaje {
	
    private String tipoEscudo;
  
    @Builder
    public Guerrero(String nombre, int puntosDeVida, int ataque, int defensa, 
                    String tipoEscudo, List<String> inventario) {
        
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inventario = inventario;
         
        
        this.tipoEscudo = tipoEscudo;
        
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("El Guerrero lanza un Grito de Guerra! Escudo: " + tipoEscudo);
    }
}