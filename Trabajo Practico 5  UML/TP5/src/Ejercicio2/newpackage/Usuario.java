package Ejercicio2.newpackage;

public class Usuario {
    private String nombre;
    private String dni;
    // Referencia de vuelta para la Asociación Bidireccional
    private Celular celular; 

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Setter para que Celular cierre la relación bidireccional
    public void setCelular(Celular celular) { 
        this.celular = celular; 
    }
}
