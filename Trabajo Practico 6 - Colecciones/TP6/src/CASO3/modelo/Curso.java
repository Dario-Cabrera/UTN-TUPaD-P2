package CASO3.modelo;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Relación N a 1: Curso tiene un Profesor

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    
    // Método requerido y CLAVE para la sincronización (Invariante de Asociación)
    public void setProfesor(Profesor nuevoProfesor) {
        // --- 1. Gestionar la ruptura de la relación con el profesor anterior ---
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            // Solo remueve si el curso estaba asociado al viejo profesor
            this.profesor.eliminarCursoInterno(this); 
        }
        
        // --- 2. Establecer el nuevo profesor ---
        this.profesor = nuevoProfesor;
        
        // --- 3. Gestionar el establecimiento de la relación con el nuevo profesor ---
        if (nuevoProfesor != null) {
            // Agrega el curso a la lista del nuevo profesor (si aún no está)
            nuevoProfesor.agregarCursoInterno(this);
        }
    }
    
    // Método requerido: Muestra información del curso y su profesor (Tarea 4)
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "N/A";
        System.out.printf("  [CÓDIGO: %s] Curso: %s | Profesor: %s\n", 
                codigo, nombre, nombreProfesor);
    }
}
