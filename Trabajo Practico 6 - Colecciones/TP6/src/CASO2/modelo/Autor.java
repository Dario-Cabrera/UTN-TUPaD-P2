package CASO2.modelo;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Getters necesarios
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Método requerido para mostrar la información
    public void mostrarInfo() {
        System.out.printf("   > Autor: %s (ID: %s, Nacionalidad: %s)\n", nombre, id, nacionalidad);
    }
}
