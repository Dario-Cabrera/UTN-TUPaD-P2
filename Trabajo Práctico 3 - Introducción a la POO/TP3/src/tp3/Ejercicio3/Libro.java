package tp3.Ejercicio3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String t, String a, int ap) {
        titulo = t;
        autor = a;
        anioPublicacion = ap;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int nuevoAno) {
        if (nuevoAno > 0 && nuevoAno <= 2025) {
            anioPublicacion = nuevoAno;
            System.out.println("El año de publicacion fue modificado a: " + nuevoAno);
        } else {
            System.out.println("Error: año invalido");
        }
    }
}
