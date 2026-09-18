package strategy;

public enum TipoUser {

	estudiante{
		@Override
		public double calcularMulta() {
			
			return 5.5;
		}
	}
	
	
	, docente{
		@Override
		public double calcularMulta() {
			return 25.0;
		}
	}
	
	, administrativo{
		@Override
		public double calcularMulta() {
			return 15.0;
		}
	};
	
	public abstract double calcularMulta();
}
