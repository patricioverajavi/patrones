package dos.agro.factory;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

// Importamos las clases del paquete model
import dos.agro.model.*;

public class ProductoFactory {
    private static ProductoFactory instancia;
    private Map<String, Class<? extends Producto>> catalogo = new HashMap<>();

    private ProductoFactory() {
        // Registramos cada tipo con su clase correspondiente
        catalogo.put("FRESCO", ProductoFresco.class);
        catalogo.put("REFRIGERADO", ProductoRefrigerado.class);
        catalogo.put("CONGELADO_AIRE", CongeladoAire.class);
        catalogo.put("CONGELADO_AGUA", CongeladoAgua.class);
        catalogo.put("CONGELADO_NITROGENO", CongeladoNitrogeno.class);
    }

    public static synchronized ProductoFactory getInstancia() {
        if (instancia == null) {
            instancia = new ProductoFactory();
        }
        return instancia;
    }

    /**
     * Crea un producto usando Reflexión.
     * @param categoria La categoría del enum CategoriaProducto
     * @param args Los argumentos exactos que pide el constructor de la clase
     */
    public Producto crear(CategoriaProducto categoria, Object... args) {
        try {
            Class<? extends Producto> clase = catalogo.get(categoria.name());
            if (clase == null) return null;

            // Identificar los tipos de los argumentos para buscar el constructor
            Class<?>[] tipos = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof Double) {
                    tipos[i] = Double.class; // Usamos Double objeto para coincidir con el modelo
                } else if (args[i] instanceof Integer) {
                    tipos[i] = Integer.class;
                } else {
                    tipos[i] = args[i].getClass();
                }
            }

            Constructor<? extends Producto> cons = clase.getConstructor(tipos);
            return cons.newInstance(args);
        } catch (Exception e) {
            System.err.println("Error al instanciar con Reflexión: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}