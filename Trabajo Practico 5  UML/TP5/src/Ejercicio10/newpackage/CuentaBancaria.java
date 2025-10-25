package Ejercicio10.newpackage;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private Titular titular; // Asociación Bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        // Composición
        this.clave = new ClaveSeguridad(codigoClave, fechaClave);
        // Bidireccional: cierra el lazo
        this.titular = titular;
        titular.setCuenta(this);
    }
}