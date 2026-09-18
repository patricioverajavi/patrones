package dos.agro.model;

import dos.agro.factory.ProductoTipo;

@ProductoTipo(tipo = "congelado_aire")
public class CongeladoAire extends ProductoCongelado {
    private double porcNitrogeno, porcOxigeno, porcCO2, porcVapor;

    public CongeladoAire(String caducidad, String lote, String envasado, String pais, Double temp, 
            Double n, Double o, Double co2, Double h2o) {
super(caducidad, lote, envasado, pais, temp);
this.porcNitrogeno = n;
this.porcOxigeno = o;
this.porcCO2 = co2;
this.porcVapor = h2o;
}
}