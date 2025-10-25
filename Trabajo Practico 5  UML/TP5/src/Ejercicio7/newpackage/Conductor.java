package Ejercicio7.newpackage;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculoAsignado;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculoAsignado = vehiculo;
    }
}