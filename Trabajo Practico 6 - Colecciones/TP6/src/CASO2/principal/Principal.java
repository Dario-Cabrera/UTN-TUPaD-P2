package CASO2.principal;

import CASO2.modelo.Autor;
import CASO2.modelo.Biblioteca;
import CASO2.modelo.Libro;

public class Principal {
    public static void main(String[] args) {
        
        // --- INICIO CASO 2: BIBLIOTECA Y LIBROS ---

        // 1. Crear una biblioteca.
        Biblioteca utnBiblioteca = new Biblioteca("Biblioteca Central UTN");

        // 2. Crear al menos tres autores.
        System.out.println("--- CREACION DE AUTORES ---");
        Autor autor1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        System.out.println("\n--- AGREGANDO 5 LIBROS ---");
        utnBiblioteca.agregarLibro("978-3-16-148410-0", "Cien anios de soledad", 1967, autor1);
        utnBiblioteca.agregarLibro("978-1-23-456789-7", "El Aleph", 1949, autor2);
        utnBiblioteca.agregarLibro("978-3-16-148411-1", "Cronica de una muerte anunciada", 1981, autor1);
        utnBiblioteca.agregarLibro("978-0-12-345678-9", "La casa de los espiritus", 1982, autor3);
        utnBiblioteca.agregarLibro("978-9-87-654321-0", "Ficciones", 1944, autor2);
        
        // 4. Listar todos los libros con su información y la del autor.
        utnBiblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n--- TAREA 5: Busqueda por ISBN ---");
        Libro buscado = utnBiblioteca.buscarLibroPorIsbn("978-0-12-345678-9");
        if (buscado != null) {
            System.out.println("Libro encontrado:");
            buscado.mostrarInfo();
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico (1949).
        utnBiblioteca.filtrarLibrosPorAnio(1949);

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n--- TAREA 7: Eliminacion de libro ---");
        utnBiblioteca.eliminarLibro("978-3-16-148411-1");
        utnBiblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n--- TAREA 8: Cantidad Total de Libros ---");
        System.out.println("Total de libros disponibles: " + utnBiblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        utnBiblioteca.mostrarAutoresDisponibles();
    }
}