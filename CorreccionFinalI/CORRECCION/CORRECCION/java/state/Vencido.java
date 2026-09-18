package state;

import java.time.LocalDate;

import com.model.Recursos;

public class Vencido implements EstadosPrestamo{


	 @Override
	    public void prestar(Recursos recurso) {
	        System.out.println("No puede prestarse.");
	    }

	    @Override
	    public void devolver(Recursos recurso) {

	        recurso.setEstado(new Disponible());

	    }

	    @Override
	    public void verificarEstado(Recursos recurso) {	

	    }

	    @Override
	    public String getEstado() {
	        return "Vencido";
	    }
}
