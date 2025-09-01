package tp3.Ejercicio1;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String n, String a, String c, double cal) {
        nombre = n;
        apellido = a;
        curso = c;
        calificacion = cal;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificacion subida a " + calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificacion bajada a " + calificacion);
    }
}
