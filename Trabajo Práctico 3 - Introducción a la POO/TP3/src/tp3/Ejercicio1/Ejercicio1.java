package tp3.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
       Estudiante miEstudiante = new Estudiante("Dario", "Cabrera", "Programacion", 8.5);
       
       miEstudiante.mostrarInfo();
       miEstudiante.subirCalificacion(1.0);
       miEstudiante.mostrarInfo();
       miEstudiante.bajarCalificacion(0.5);
       miEstudiante.mostrarInfo();
    }
}
