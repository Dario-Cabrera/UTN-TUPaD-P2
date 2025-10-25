package CASO2.modelo;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relación con la clase Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters necesarios para la búsqueda y filtrado
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    // Método requerido para mostrar la información (incluye la del Autor)
    public void mostrarInfo() {
        System.out.printf("  [ISBN: %s] Titulo: %s (Anio: %d)\n",
                isbn, titulo, anioPublicacion);
        // Llama al método del objeto Autor
        autor.mostrarInfo();
    }
}