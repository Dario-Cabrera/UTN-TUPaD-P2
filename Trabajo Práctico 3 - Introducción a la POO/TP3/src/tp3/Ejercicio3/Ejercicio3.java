package tp3.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Libro miLibro = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        
        System.out.println("Titulo: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Año de publicacion: " + miLibro.getAnioPublicacion());
        
        miLibro.setAnioPublicacion(2027);
        System.out.println("Año de publicacion modificado: " + miLibro.getAnioPublicacion());
        
        miLibro.setAnioPublicacion(2020);
        System.out.println("Año de publicacion modificado: " + miLibro.getAnioPublicacion());
    }
}
