package Ejercicio11.newpackage;

public class Reproductor {
    // Dependencia de Uso: Usa Cancion como parámetro del método
    public void reproducir(Cancion cancion) { 
        System.out.println("Reproduciendo: " + cancion.getTitulo());
    }
}
