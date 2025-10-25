package tp3.Ejercicio5;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public NaveEspacial(String n, int c) {
        nombre = n;
        combustible = c;
    }
    
    public void despegar() {
        System.out.println("La nave espacial " + nombre + " esta despegando.");
    }
    
    public void avanzar(int distancia) {
        int combustibleRequerido = distancia / 10;
        if (combustible >= combustibleRequerido) {
            combustible -= combustibleRequerido;
            System.out.println("La nave " + nombre + " ha avanzado " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        final int LIMITE_COMBUSTIBEL = 100;
        if (combustible + cantidad <= LIMITE_COMBUSTIBEL) {
            combustible += cantidad;
            System.out.println("Combustible recargado. Total actual: " + combustible);
        } else {
            System.out.println("La cantidad de recarga " + cantidad + "excede al limite de combustible");          
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
}
