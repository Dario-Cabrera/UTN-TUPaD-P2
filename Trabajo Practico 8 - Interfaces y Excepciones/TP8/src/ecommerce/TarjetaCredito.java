package ecommerce;

public class TarjetaCredito implements PagoConDescuento {
    private double tasaDescuento = 0.10; // 10%

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito por $" + monto + " procesado.");
        return true;
    }

    @Override
    public double aplicarDescuento(double montoOriginal) {
        double montoConDescuento = montoOriginal * (1 - tasaDescuento);
        System.out.println("Descuento de " + (tasaDescuento * 100) + "% aplicado.");
        return montoConDescuento;
    }
}