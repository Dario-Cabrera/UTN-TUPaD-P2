package Ejercicio9.newpackage;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente; // Asociación Unidireccional
    private Profesional profesional; // Asociación Unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
}
