package PatronDisenioFactory;

public class Libro implements Producto {
    private String isbn;
    private String titulo;
    private String resena;
    private String autor;
    private double precio;
    private int paginas;

    public Libro(String isbn, String titulo, String resena, String autor, double precio, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.resena = resena;
        this.autor = autor;
        this.precio = precio;
        this.paginas = paginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor + " - Precio: $" + precio);
    }
}
