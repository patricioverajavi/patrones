package state;

import java.time.LocalDate;
import com.model.Recursos;

public class Prestado implements EstadosPrestamo{

	
	@Override
    public void prestar(Recursos recurso) {
        System.out.println("El recurso ya está prestado.");
    }

    @Override
    public void devolver(Recursos recurso) {
        recurso.setEstado(new Disponible());
    }

    @Override
    public void verificarEstado(Recursos recurso) {

        if(LocalDate.now().isAfter(recurso.getFechaDevolucion())){

            recurso.setEstado(new Vencido());

        }

    }

    @Override
    public String getEstado() {
        return "Prestado";
    }

}
