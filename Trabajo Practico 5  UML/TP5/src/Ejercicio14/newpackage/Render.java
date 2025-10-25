package Ejercicio14.newpackage;

public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación Unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
}
