package CASO2;

import java.util.ArrayList;

public class Main_E2 {
    public static void main(String[] args) {
        // Creamos un array list de figuras
        ArrayList<Figura> figuras = new ArrayList<>();

        // Creamos y añadimos figuras al array
        figuras.add(new Rectangulo(4.0, 4.0, "Rectangulo 1"));
        figuras.add(new Rectangulo(6.0, 4.0, "Rectangulo 2"));
        figuras.add(new Circulo(10.0, "Circulo 1"));
        figuras.add(new Circulo(15.0, "Circulo 2"));

        // Recorremos el array y llamamos a calcularArea() usando polimorfismo
        for (Figura f : figuras) {
            f.calcularArea();
        }
    }
}
