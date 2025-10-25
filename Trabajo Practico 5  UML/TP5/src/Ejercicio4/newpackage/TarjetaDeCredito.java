package Ejercicio4.newpackage;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String num, String fecha, Cliente cliente, Banco banco) {
        this.numero = num;
        this.fechaVencimiento = fecha;
        // Agregación
        this.banco = banco;
        // Bidireccional: cierra el lazo
        this.cliente = cliente;
        cliente.setTarjeta(this);
    }
}