package CASO3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Métodos de Administración de la Universidad
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    // Método requerido: Asignar profesor a curso (Tarea 3)
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            // La magia de la sincronización ocurre dentro de setProfesor()
            curso.setProfesor(profesor); 
            System.out.printf("✅ Asignación: Profesor %s asignado al Curso %s.\n", 
                profesor.getNombre(), curso.getNombre());
            return true;
        }
        System.out.println("❌ Error: Curso o Profesor no encontrado para la asignación.");
        return false;
    }

    // Método requerido: Listar Profesores (Tarea 4)
    public void listarProfesores() {
        System.out.println("\n--- PROFESORES DE " + nombre + " ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    // Método requerido: Listar Cursos (Tarea 4)
    public void listarCursos() {
        System.out.println("\n--- CURSOS EN " + nombre + " ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    
    // Método requerido: Eliminar Curso (Tarea 6)
    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            // 1. Romper la relación con su profesor si la tiene.
            if (c.getProfesor() != null) {
                c.setProfesor(null); // Esto sincroniza eliminando el curso de la lista del profesor.
            }
            // 2. Eliminar el curso de la lista de la Universidad.
            cursos.remove(c);
            System.out.println("🗑️ Curso '" + c.getNombre() + "' eliminado.");
            return true;
        }
        System.out.println("❌ Error: Curso no encontrado para eliminar.");
        return false;
    }

    // Método requerido: Eliminar Profesor (Tarea 7)
    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // 1. Dejar null en los cursos que dictaba (romper la relación N a 1)
            // Es CRUCIAL iterar sobre una copia para evitar ConcurrentModificationException
            List<Curso> cursosDictados = new ArrayList<>(p.getCursos()); 
            for (Curso c : cursosDictados) {
                c.setProfesor(null); // Esto sincroniza eliminando el curso de la lista del profesor (copia).
            }
            // 2. Eliminar el profesor de la lista de la Universidad.
            profesores.remove(p);
            System.out.println("🗑️ Profesor '" + p.getNombre() + "' eliminado. Sus cursos quedaron sin asignar.");
            return true;
        }
        System.out.println("❌ Error: Profesor no encontrado para eliminar.");
        return false;
    }
    
    // Método requerido: Reporte de cursos por profesor (Tarea 8)
    public void generarReporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: Cantidad de Cursos por Profesor ---");
        for (Profesor p : profesores) {
            System.out.printf("  %s (%s): %d cursos\n", 
                p.getNombre(), p.getEspecialidad(), p.getCursos().size());
        }
    }
}
