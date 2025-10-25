package Ejercicio11.newpackage;

public class Cancion {
    private String titulo;
    private Artista artista; // Asociación Unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    // Getter necesario para la Dependencia de Uso
    public String getTitulo() { return titulo; }
}
