package dos.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sun.jdi.Field;

import dos.agro.factory.CategoriaProducto;
import dos.agro.factory.ProductoFactory;
import dos.conexion.ConexionDB;


public class GestionProductoServicio {

	// Usamos el mismo estilo que propusiste
    public void crear(Producto p) {
        
        // Usamos ConexionDB (que es tu dbConfig) para obtener la conexión
        try (Connection con = ConexionDB.getConexion()) {
            
            // Adaptamos los nombres de las columnas a tu tabla 'producto'
            var pstmt = con.prepareStatement("insert into producto(id, nombre, precio) values (?, ?, ?)");
            System.out.println("Se conecto a la base");
            
            // Seteamos los valores usando los datos del objeto Producto
           // pstmt.setInt(1, p.getId());            // ID del producto
            pstmt.setString(2, p.getNumeroLote()); // Usamos el Lote como "nombre"
            pstmt.setDouble(3, 0.0);               // Como no hay precio en la consigna, enviamos 0.0 o un valor base
            
            pstmt.executeUpdate();
            System.out.println("Producto guardado con éxito mediante el método crear");
            
        } catch (Exception e) {
            System.out.println("Hubo un error en la conexion");
            throw new RuntimeException(e);
        }
    }

}