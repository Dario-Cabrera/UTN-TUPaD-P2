package CASO3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Relación 1 a N: Profesor dicta muchos Cursos

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }
    
    public String getEspecialidad() {
    return especialidad;
    }
    
    // Métodos para la gestión INTERNA de la lista de cursos (SIN SINCRONIZACIÓN)
    // Se usan desde Curso.setProfesor() para evitar ciclos infinitos.
    public void agregarCursoInterno(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void eliminarCursoInterno(Curso c) {
        cursos.remove(c);
    }
    
    // Métodos de SINCRONIZACIÓN y PÚBLICOS
    
    // Tarea: Sincroniza la adición de un curso
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            // 1. Agrega el curso a su lista (lado 1 a N)
            cursos.add(c); 
            // 2. Sincroniza el lado N a 1 (Llama a setProfesor para que rompa lazo previo si existe)
            c.setProfesor(this);
        }
    }
    
    // Tarea: Sincroniza la eliminación de un curso
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            // 1. Quita el curso de la lista.
            // 2. Sincroniza el lado N a 1 (Quita el profesor del curso)
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    // Método requerido: Muestra datos del profesor y cantidad de cursos (Tarea 4)
    public void mostrarInfo() {
        System.out.printf("  [ID: %s] %s - Especialidad: %s (Cursos que dicta: %d)\n", 
                id, nombre, especialidad, cursos.size());
    }

    // Método requerido: Listar cursos que dicta (Tarea 4)
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("    - No dicta cursos actualmente.");
            return;
        }
        for (Curso c : cursos) {
            System.out.printf("    - [%s] %s\n", c.getCodigo(), c.getNombre());
        }
    }
}
