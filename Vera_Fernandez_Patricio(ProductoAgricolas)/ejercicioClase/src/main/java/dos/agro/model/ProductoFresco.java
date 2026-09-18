package dos.agro.model;

import dos.agro.factory.ProductoTipo;

@ProductoTipo(tipo = "fresco") // <--- Aquí aplicas la anotación
public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(int id, String caducidad, String lote, String envasado, String pais) {
        super(caducidad, lote);
        this.id = id; // Asignamos el id
        // ... resto de atributos
    }
}