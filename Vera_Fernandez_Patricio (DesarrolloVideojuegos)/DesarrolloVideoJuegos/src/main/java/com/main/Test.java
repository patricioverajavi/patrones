package com.main;

import java.util.Arrays;

import com.factory.ConfiguracionPlataforma;
import com.factory.FactoryGen;
import com.model.Arquero;
import com.model.Enemigo;
import com.model.Guerrero;
import com.model.Mago;

public class Test {

	public static void main(String[] args) {
		// Guerrero
         
        System.out.println(" Factory: Creado personaje base para PC");
        Guerrero ragnar = Guerrero.builder()
                .nombre("Ragnar Lothbrok")
                .puntosDeVida(200)
                .ataque(75)
                .defensa(40)
                .tipoEscudo("Escudo de Roble")
                .inventario(Arrays.asList("Hacha", "Poción", "Mapa"))
                .build();
        
      ragnar.setPlataforma("PC");
      ragnar.setCalidadGrafica("Ultra defenition");
      ragnar.setInteligenciaArtificial("Fuerte (Basada en Boss)");
      System.out.println(ragnar);
      System.out.println("------accion-------");
      ragnar.mostrarHabilidad();
      //Enemigo
      Enemigo orcoBase = Enemigo.builder()
    		    .nombre("Orco Base")
    		    .hp(100)
    		    .rango("Común")
    		    .comportamientoIA("Pasivo")
    		    .build();

    		System.out.println("1. Creando Prototipo Base: " + orcoBase);

    		Enemigo orcoElite = orcoBase.clonarConVariante("Orco Elite", 100); 
    		Enemigo orcoMago = new Enemigo("Orco Mago", 150, "Mago", "Estratégico"); 
    		Enemigo orcoBerserker = orcoBase.clonarConVariante("Orco Berserker", 300); 


    		System.out.println("\nVariantes creadas:");
    		System.out.println("1. " + orcoElite);
    		System.out.println("2. " + orcoMago);
    		System.out.println("3. " + orcoBerserker);
    	
    		//Arquero
    		System.out.println("\n Factory e Builder: Arquero");
    		Arquero arc = Arquero.builder()
    		        .nombre("Robin Hood")
    		        .puntosDeVida(120)
    		        .ataque(60)
    		        .defensa(30)
    		        //.precision(0.95)
    		        .inventario(Arrays.asList("Arco Largo", "Cuchillo", "Daga"))
    		        .build();

    			arc.setPlataforma("Android / iOS");
    		arc.setCalidadGrafica("Regular");
    		arc.setInteligenciaArtificial("Francotirador");
    		System.out.println(arc);

    		
    		arc.mostrarHabilidad();
	}
}
