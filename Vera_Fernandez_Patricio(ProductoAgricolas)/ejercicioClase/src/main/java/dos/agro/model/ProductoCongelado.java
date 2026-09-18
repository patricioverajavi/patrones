package dos.agro.model;

public abstract class ProductoCongelado extends Producto {

	protected String fechaEnvasado;
	    protected String paisOrigen;
	    protected double tempMantenimiento;

	    public ProductoCongelado(String caducidad, String lote, String envasado, String pais, double temp) {
	        super(caducidad, lote);
	        this.fechaEnvasado = envasado;
	        this.paisOrigen = pais;
	        this.tempMantenimiento = temp;
	    }
	}