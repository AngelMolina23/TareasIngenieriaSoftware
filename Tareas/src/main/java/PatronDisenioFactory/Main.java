package PatronDisenioFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto libro = ProductFactory.crearProducto(
                "libro",
                "978-1234567890", "El Principito", "Un cuento filosófico", "Antoine de Saint-Exupéry", 15.99, 98
        );

        Producto revista = ProductFactory.crearProducto(
                "revista",
                "ISSN-9876", "National Geographic", 202, 8.5, "Mensual"
        );

        Producto periodico = ProductFactory.crearProducto(
                "periodico",
                "ID-001", "El Diario", LocalDate.now(), 1.2
        );

        libro.mostrarInformacion();
        revista.mostrarInformacion();
        periodico.mostrarInformacion();
    }
}

