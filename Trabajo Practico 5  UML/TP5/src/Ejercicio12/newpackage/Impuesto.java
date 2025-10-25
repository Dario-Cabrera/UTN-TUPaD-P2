package Ejercicio12.newpackage;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación Unidireccional

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    // Getter necesario para la Dependencia de Uso
    public double getMonto() { return monto; }
}