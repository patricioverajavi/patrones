package dos.agro.model;

import dos.agro.factory.ProductoTipo;

@ProductoTipo(tipo = "congelado_agua")
public class CongeladoAgua extends ProductoCongelado {
    private double salinidad; // gramos de sal por litro

	public CongeladoAgua(String caducidad, String lote, String envasado, String pais, double temp, double salinidad) {
		super(caducidad, lote, envasado, pais, temp);
		this.salinidad = salinidad;
	}

  
    }
