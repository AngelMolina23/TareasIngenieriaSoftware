package PatronDisenioFactory;

import java.time.LocalDate;

public class Periodico implements Producto {
    private String id;
    private String nombre;
    private LocalDate fechaPublicacion;
    private double precio;

    public Periodico(String id, String nombre, LocalDate fechaPublicacion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Periódico: " + nombre + " - Fecha: " + fechaPublicacion + " - Precio: $" + precio);
    }
}

