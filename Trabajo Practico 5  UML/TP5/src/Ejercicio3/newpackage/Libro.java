package Ejercicio3.newpackage;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // Asociación Unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
}