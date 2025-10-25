package Ejercicio5.newpackage;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición
    private Propietario propietario; // Asociación Bidireccional

    public Computadora(String marca, String serie, String modPlaca, String chipPlaca, Propietario prop) {
        this.marca = marca;
        this.numeroSerie = serie;
        // Composición: Crea el objeto interno
        this.placaMadre = new PlacaMadre(modPlaca, chipPlaca);
        // Bidireccional: cierra el lazo
        this.propietario = prop;
        prop.setEquipo(this);
    }
}