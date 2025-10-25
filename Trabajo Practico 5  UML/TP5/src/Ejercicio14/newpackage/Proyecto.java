package Ejercicio14.newpackage;

public class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    // Getter necesario para la Dependencia de Creación
    public String getNombre() { return nombre; }
}
