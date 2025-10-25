package CASO4;

import java.util.ArrayList;

public class Main_E4 {
    public static void main(String[] args) {
        // Inicializamos array de animales
        ArrayList<Animal> animales = new ArrayList<>();

        // Creamos y agregamos animales al array
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        // Recorremos el array y llamamos al metodo hacerSonido() (Polimorfismo)
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}