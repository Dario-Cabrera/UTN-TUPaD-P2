package CASO3.principal;

import CASO3.modelo.Curso;
import CASO3.modelo.Profesor;
import CASO3.modelo.Universidad;

public class Principal {
    public static void main(String[] args) {
        
        // --- INICIO CASO 3: UNIVERSIDAD, PROFESOR Y CURSO ---
        
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P001", "Dr. Andrés Gómez", "Programación");
        Profesor p2 = new Profesor("P002", "Ing. Laura Pérez", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "Lic. Mónica Ruiz", "Diseño Web");
        
        Curso c1 = new Curso("C101", "Programación Orientada a Objetos");
        Curso c2 = new Curso("C102", "Estructuras de Datos Avanzadas");
        Curso c3 = new Curso("C201", "Introducción a SQL");
        Curso c4 = new Curso("C301", "Desarrollo Frontend con HTML/CSS");
        Curso c5 = new Curso("C302", "JavaScript Moderno");
        
        // 2. Agregar profesores y cursos a la universidad.
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        System.out.println("--- 3. ASIGNACIÓN INICIAL DE CURSOS ---");
        // 3. Asignar profesores a cursos.
        utn.asignarProfesorACurso("C101", "P001"); // Gómez: POO
        utn.asignarProfesorACurso("C102", "P001"); // Gómez: Estructuras
        utn.asignarProfesorACurso("C201", "P002"); // Pérez: SQL
        utn.asignarProfesorACurso("C301", "P003"); // Ruiz: HTML/CSS

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        utn.listarCursos();
        utn.listarProfesores();

        System.out.println("\n--- 5. CAMBIO DE PROFESOR Y VERIFICACIÓN DE SINCRONIZACIÓN ---");
        // 5. Cambiar el profesor del C102 (Estructuras) de Gómez (P001) a Pérez (P002).
        utn.asignarProfesorACurso("C102", "P002"); 
        
        // Verificar que Gómez (P001) perdió el curso y Pérez (P002) lo ganó.
        utn.listarProfesores();

        System.out.println("\n--- 6. REMOVER UN CURSO Y VERIFICAR RUPTURA DE RELACIÓN ---");
        // 6. Remover el curso C301 (Diseño Web).
        utn.eliminarCurso("C301");
        
        // Verificar que Ruiz (P003) no dicta C301.
        utn.listarProfesores();

        System.out.println("\n--- 7. REMOVER UN PROFESOR Y DEJAR CURSOS EN NULL ---");
        // 7. Remover al Profesor Pérez (P002).
        utn.eliminarProfesor("P002");
        
        // Verificar que C102 y C201 quedaron sin profesor.
        utn.listarCursos();
        utn.listarProfesores(); // Pérez ya no aparece

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        utn.generarReporteCursosPorProfesor();
    }
}
