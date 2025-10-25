package Ejercicio6.newpackage;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación Unidireccional
    private Mesa mesa; // Agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
}
