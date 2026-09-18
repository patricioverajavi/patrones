package dos.agro.factory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProductoTipo {
    // Esto permite usar @ProductoTipo(tipo = "fresco")
    String tipo(); 
}