package PatronDisenioFactory;
import java.time.LocalDate;

public class ProductFactory {

    public static Producto crearProducto(String tipo, Object... datos) {
        switch (tipo.toLowerCase()) {
            case "libro":
                return new Libro(
                        (String) datos[0], // ISBN
                        (String) datos[1], // Título
                        (String) datos[2], // Reseña
                        (String) datos[3], // Autor
                        (double) datos[4], // Precio
                        (int) datos[5]     // Páginas
                );
            case "revista":
                return new Revista(
                        (String) datos[0], // ISSN
                        (String) datos[1], // Nombre
                        (int) datos[2],    // Número de edición
                        (double) datos[3], // Precio
                        (String) datos[4]  // Periodicidad
                );
            case "periodico":
                return new Periodico(
                        (String) datos[0],       // ID
                        (String) datos[1],       // Nombre
                        (LocalDate) datos[2],    // Fecha de publicación
                        (double) datos[3]        // Precio
                );
            default:
                throw new IllegalArgumentException("Tipo de producto no válido: " + tipo);
        }
    }
}

