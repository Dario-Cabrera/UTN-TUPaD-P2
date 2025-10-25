package Ejercicio13.newpackage;

public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación Unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
}
