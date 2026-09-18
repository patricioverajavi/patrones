package state;

import com.model.Recursos;

public interface EstadosPrestamo {
	
    void prestar(Recursos recurso);

    void devolver(Recursos recurso);

    void verificarEstado(Recursos recurso);

    String getEstado();
}
