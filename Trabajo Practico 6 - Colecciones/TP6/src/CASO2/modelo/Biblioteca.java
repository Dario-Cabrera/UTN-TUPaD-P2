package CASO2.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros; // Colección principal (Composición 1 a N)

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Tarea 3: Agregar Libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
    }

    // Tarea 5: Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }
    
    // Tarea 4: Listar todos los libros
    public void listarLibros() {
        System.out.println("\n--- LISTADO COMPLETO DE LIBROS EN " + nombre + " ---");
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacia.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    // Tarea 7: Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            System.out.println("🗑️ Libro con ISBN '" + isbn + "' eliminado.");
            return true;
        }
        return false;
    }

    // Tarea 8: Obtener cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Tarea 6: Filtrar libros por año
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- LIBROS PUBLICADOS EN EL ANIO: " + anio + " ---");
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el anio " + anio + ".");
        }
    }
    
    // Tarea 9: Mostrar autores disponibles (usando HashSet para unicidad)
    public void mostrarAutoresDisponibles() {
        System.out.println("\n--- AUTORES DISPONIBLES EN LA BIBLIOTECA ---");
        // Usamos Set para garantizar que cada autor aparezca solo una vez.
        Set<Autor> autoresUnicos = new HashSet<>(); 

        for (Libro l : libros) {
            autoresUnicos.add(l.getAutor());
        }
        
        for (Autor a : autoresUnicos) {
            a.mostrarInfo();
        }
    }
}
