package Ejercicio5.newpackage;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora equipo;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void setEquipo(Computadora equipo) {
        this.equipo = equipo;
    }
}
