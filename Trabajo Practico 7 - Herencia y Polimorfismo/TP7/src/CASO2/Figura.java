package CASO2;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto, debe ser implementado por las subclases
    public abstract void calcularArea(); 
}
