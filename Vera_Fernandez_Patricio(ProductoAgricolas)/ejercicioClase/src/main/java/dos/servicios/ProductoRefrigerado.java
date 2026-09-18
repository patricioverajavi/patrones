package dos.servicios;

public class ProductoRefrigerado extends Producto{

	private String codigoSupervision;
    private String fechaEnvasado;
    private double temperaturaRecomendada;
    private String paisOrigen;

    public ProductoRefrigerado(String caducidad, String lote, String codigo, String envasado, double temp, String pais) {
        //super(caducidad, lote);
        this.codigoSupervision = codigo;
        this.fechaEnvasado = envasado;
        this.temperaturaRecomendada = temp;
        this.paisOrigen = pais;
    }

}
