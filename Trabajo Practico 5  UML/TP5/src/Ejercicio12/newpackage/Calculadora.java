package Ejercicio12.newpackage;

public class Calculadora {
    // Dependencia de Uso: Usa Impuesto como parámetro del método
    public void calcular(Impuesto impuesto) { 
        System.out.println("Calculando impuesto de: $" + impuesto.getMonto());
    }
}