package Ejercicio8.newpackage;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, String hash, String fecha, Usuario usuarioFirma) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Composición: Crea el objeto FirmaDigital
        this.firma = new FirmaDigital(hash, fecha, usuarioFirma);
    }
}
