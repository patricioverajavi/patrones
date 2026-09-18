package com;

import com.biblioteca.Biblioteca;
import com.factory.Factory;
import com.model.Recursos;
import com.model.Usuario;

import strategy.TipoUser;

public class AppPrestamo {

	public static void main(String[] args) {
		
		Factory f = new Factory();
		f.init("com.model");
		System.out.println(f.getComponente().toString());
		
		Recursos libro =
                f.crear("libro");
          libro.setCodigo("123");
          libro.setTitulo("Las aventuras de Narnia");
          
          

      Usuario estudiante =
                new Usuario(
                        "Carlos",
                        TipoUser.estudiante);

       Biblioteca bib =
                new Biblioteca(libro, estudiante);
                        

        libro.mostrar();

        System.out.println("\nEstado inicial" );
        System.out.println("\n--- PRÉSTAMO ---");

        bib.prestar();

        System.out.println("Estado: " + libro.getEstado().getEstado());
        System.out.println("Fecha préstamo: " + libro.getFechaPrestamo());
        System.out.println("Fecha devolución: " + libro.getFechaDevolucion());
        libro.getEstado().verificarEstado(libro);
        System.out.println(bib.costoMulta());

	}

}
