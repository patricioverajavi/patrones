package dos.agro.model;

import dos.agro.factory.ProductoTipo;

@ProductoTipo(tipo = "congelado_nitrogeno")
public class CongeladoNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion; 

    public CongeladoNitrogeno(String caducidad, String lote, String envasado, String pais, Double temp, 
                             String metodo, Integer tiempo) {
        super(caducidad, lote, envasado, pais, temp);
        this.metodoCongelacion = metodo;
        this.tiempoExposicion = tiempo;
    }
}