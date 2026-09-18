package dos.servicios;

	public abstract class Producto {
	    protected String fechaCaducidad;
	    protected String numeroLote;
	    
	    
		public String getFechaCaducidad() {
			return fechaCaducidad;
		}
		public void setFechaCaducidad(String fechaCaducidad) {
			this.fechaCaducidad = fechaCaducidad;
		}
		public String getNumeroLote() {
			return numeroLote;
		}
		public void setNumeroLote(String numeroLote) {
			this.numeroLote = numeroLote;
		}
	   
	    
	}