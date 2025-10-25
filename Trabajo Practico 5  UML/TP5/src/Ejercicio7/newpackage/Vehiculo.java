package Ejercicio7.newpackage;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        // Agregación
        this.motor = motor;
        // Bidireccional: cierra el lazo
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }
}
