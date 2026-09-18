package Imprime;

import dos.agro.factory.CategoriaProducto;
import dos.servicios.GestionProductoServicio;

public class Test {

	public static void main(String[] args) {
		
	
		// 1. Instanciamos el servicio
        GestionProductoServicio servicio = new GestionProductoServicio();

        System.out.println("--- PRUEBA SISTEMA AGROALIMENTARIO ---");

        // 2. Registramos un solo producto: Congelado por Aire
        // Datos: Caducidad, Lote, Envasado, País, Temp, %N, %O, %CO2, %H2O
        servicio.registrarProducto(
            CategoriaProducto.CONGELADO_AIRE, 
            "2026-12-01", "LOT-AIR-99", "2026-04-24", "Ecuador", -18.0, 
            78.0, 21.0, 0.5, 0.5
        );
        
        System.out.println("---------------------------------------");
    }
	
	
	
	
}
