package tp3.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1, 1);
        Gallina gallina2 = new Gallina(2, 2);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
