package Ejercicio13.newpackage;

public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    // Getter necesario para la Dependencia de Creación
    public String getNombre() { return nombre; }
}
