package dos.agro.model;

public class Producto {
	protected int id;
	protected String fechaCaducidad;
    protected String numeroLote;

    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public int getId() { return id; }
    public String getNumeroLote() { return numeroLote; }
    public String getFechaCaducidad() { return fechaCaducidad; 
    }}

    