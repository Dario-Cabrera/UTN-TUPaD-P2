package tp3.Ejercicio2;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(String n, String e, int ed) {
        nombre = n;
        especie = e;
        edad = ed;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println(nombre + " cumplio años. Ahora tiene " + edad);
    }
}

