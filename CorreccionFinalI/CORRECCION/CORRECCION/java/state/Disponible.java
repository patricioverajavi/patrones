package state;

import java.time.LocalDate;
import com.model.Recursos;

public class Disponible implements EstadosPrestamo{


	 @Override
	    public void prestar(Recursos recurso) {
	        recurso.setEstado(new Prestado());
	        recurso.setFechaPrestamo(LocalDate.now().minusDays(16));
	        recurso.setFechaDevolucion(recurso.getFechaPrestamo().plusDays(15));
	        recurso.setEstado(new Prestado());
	    }

	    @Override
	    public void devolver(Recursos recurso) {
	        System.out.println("El recurso ya está disponible.");
	    }

	    @Override
	    public void verificarEstado(Recursos recurso) {
	    }

	    @Override
	    public String getEstado() {
	        return "Disponible";
	    }
}
