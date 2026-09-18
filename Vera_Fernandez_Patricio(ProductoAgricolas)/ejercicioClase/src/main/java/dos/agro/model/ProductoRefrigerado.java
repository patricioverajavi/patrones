package dos.agro.model;

import dos.agro.factory.ProductoTipo;

@ProductoTipo(tipo = "refrigerado")
public class ProductoRefrigerado extends Producto {
	
    private String fechaCaducidad;
	private int lote;
    private String fechaEnvasado;
    private double tempRecomendada;
    private String paisOrigen;
    
    
	public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String fechaCaducidad2, int lote,
			String fechaEnvasado, double tempRecomendada, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		fechaCaducidad = fechaCaducidad2;
		this.lote = lote;
		this.fechaEnvasado = fechaEnvasado;
		this.tempRecomendada = tempRecomendada;
		this.paisOrigen = paisOrigen;
	}
    

   
    }
