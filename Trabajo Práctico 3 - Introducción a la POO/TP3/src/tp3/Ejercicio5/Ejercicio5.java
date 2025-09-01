package tp3.Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("SpaceX", 50);
        
        nave1.mostrarEstado();
        
        nave1.avanzar(600);
        
        nave1.recargarCombustible(30);
        
        nave1.avanzar(600);
        
        nave1.mostrarEstado();
    }
}
