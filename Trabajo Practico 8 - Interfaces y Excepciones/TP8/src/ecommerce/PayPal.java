package ecommerce;

public class PayPal implements Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago con PayPal por $" + monto + " procesado.");
        return true;
    }
}